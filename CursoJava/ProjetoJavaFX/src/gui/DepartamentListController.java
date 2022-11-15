package gui;


import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

import application.Main;
import db.DbIntegrityException;
import gui.listeners.DataChangeListener;
import gui.util.Alerts;
import gui.util.Utils;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.entities.Departament;
import model.services.DepartamentService;

public class DepartamentListController implements Initializable, DataChangeListener {

	private DepartamentService service;//declarando uma dependencia com o departamentService
	//vai fornecer o servico
	//não estamos fazendo com o new, pq ai seria um acoplamento forte

	@FXML
	private TableView<Departament> tableViewDepartment;//tabela 

	@FXML
	private TableColumn<Departament, Integer> tableColumnId;//coluna
	//o tipo da entidade, tipo da coluna

	@FXML
	private TableColumn<Departament, String> tableColumnName;//coluna
	//o tipo da entidade, tipo da coluna

	@FXML
	private TableColumn<Departament, Departament> tableColumnEDIT;//coluna
	//o tipo da entidade, tipo da coluna

	@FXML
	private TableColumn<Departament, Departament> tableColumnREMOVE;//coluna
	//o tipo da entidade, tipo da coluna

	@FXML
	private Button btNew;//bbotao

	private ObservableList<Departament> obsList;

	@FXML
	public void onBtNewAction(ActionEvent event) {//acao do botao
		Stage parentStage = Utils.currentStage(event);
		Departament obj = new Departament();
		createDialogForm(obj, "/gui/DepartmentForm.fxml", parentStage);
	}

	public void setDepartmentService(DepartamentService service) {
		this.service = service;//injetando dependencia sem o acoplamento forte do new
		//é uma inversao de controler
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();//para inicializar algum componente da tela
	}

	private void initializeNodes() {//vai inicializar apropriadamente o comportamento das minhas colunas da table
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
		//inicializando o a coluna id da tabbela. isso é um padrao do javaFX para ele inicializar
		//o comportamento das colunas
		tableColumnName.setCellValueFactory(new PropertyValueFactory<>("name"));
		
		//fazer a table acompanhar o tamanho da tabela
		Stage stage = (Stage) Main.getMainScene().getWindow();
		//pegando uma eferencia para o stage atual.
		//getWindow() -> essa funcao pega a referencia para a janela. esse window é uma superclasse do stage
		//entao para atribuit para o stage eu tenho que fazer um dowcasting
		
		tableViewDepartment.prefHeightProperty().bind(stage.heightProperty());
		//ligando a tabela para acompanhar o stage
	}

	public void updateTableView() {//meotoo responsavel por acessar o serviço, bcarrgar os departamentos e 
		//jogar esses departamentos dentro observablelist
		if (service == null) {
			throw new IllegalStateException("Service was null");
		}
		List<Departament> list = service.findAll();
		obsList = FXCollections.observableArrayList(list);
		tableViewDepartment.setItems(obsList);
		initEditButtons();
		initRemoveButtons();
	}

	private void createDialogForm(Departament obj, String absoluteName, Stage parentStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			Pane pane = loader.load();

			DepartamentFormController controller = loader.getController();
			controller.setDepartment(obj);
			controller.setDepartmentService(new DepartamentService());
			controller.subscribeDataChangeListener(this);
			controller.updateFormData();

			Stage dialogStage = new Stage();
			dialogStage.setTitle("Enter Department data");
			dialogStage.setScene(new Scene(pane));
			dialogStage.setResizable(false);
			dialogStage.initOwner(parentStage);
			dialogStage.initModality(Modality.WINDOW_MODAL);
			dialogStage.showAndWait();
		} catch (IOException e) {
			e.printStackTrace();
			Alerts.showAlert("IO Exception", "Error loading view", e.getMessage(), AlertType.ERROR);
		}
	}

	@Override
	public void onDataChanged() {
		updateTableView();
	}

	private void initEditButtons() {
		tableColumnEDIT.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue()));
		tableColumnEDIT.setCellFactory(param -> new TableCell<Departament, Departament>() {
			private final Button button = new Button("edit");

			@Override
			protected void updateItem(Departament obj, boolean empty) {
				super.updateItem(obj, empty);
				if (obj == null) {
					setGraphic(null);
					return;
				}
				setGraphic(button);
				button.setOnAction(
						event -> createDialogForm(obj, "/gui/DepartmentForm.fxml", Utils.currentStage(event)));
			}
		});
	}

	private void initRemoveButtons() {
		tableColumnREMOVE.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue()));
		tableColumnREMOVE.setCellFactory(param -> new TableCell<Departament, Departament>() {
			private final Button button = new Button("remove");

			@Override
			protected void updateItem(Departament obj, boolean empty) {
				super.updateItem(obj, empty);
				if (obj == null) {
					setGraphic(null);
					return;
				}
				setGraphic(button);
				button.setOnAction(event -> removeEntity(obj));
			}
		});
	}

	private void removeEntity(Departament obj) {
		Optional<ButtonType> result = Alerts.showConfirmation("Confirmation", "Are you sure to delete?");

		if (result.get() == ButtonType.OK) {
			if (service == null) {
				throw new IllegalStateException("Service was null");
			}
			try {
				service.remove(obj);
				updateTableView();
			}
			catch (DbIntegrityException e) {
				Alerts.showAlert("Error removing object", null, e.getMessage(), AlertType.ERROR);
			}
		}
	}
}

