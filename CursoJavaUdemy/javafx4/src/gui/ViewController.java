package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import gui.util.Alerts;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import model.entities.Person;

public class ViewController implements Initializable {

	@FXML
	private ComboBox<Person> comboBoxPerson;
	//combbobox é um tipo generico
	
	@FXML
	private Button btAll;
	
	private ObservableList<Person> obsList;/*propriedade de tipo especial de lista
	que ele ja fica associado ao componente visual, ele ja implementa um comportamento de 
	interacao entre o componente visual e a colecao*/
	
	@FXML
	public void onComboBoxPersonAction() {//implementando um evento para quando selecionar o item
		Person person = comboBoxPerson.getSelectionModel().getSelectedItem();//pega o item
		System.out.println(person);
		Alerts.showAlert("Item Selecionado", null, person.getName(), AlertType.INFORMATION);
	}
	
	@FXML
	public void onBtAllAction() {
		String nomes = "";
		for (Person person : comboBoxPerson.getItems()) {
			System.out.println(person);
			nomes += person.getName() + "\n";
		}
		Alerts.showAlert("Item Selecionado", null, nomes, AlertType.INFORMATION);
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		List<Person> list = new ArrayList<>(); //criando uma lista
		list.add(new Person(1, "Maria", "maria@gmail.com"));
		list.add(new Person(2, "Alex", "alex@gmail.com"));
		list.add(new Person(3, "Box", "bob@gmail.com"));
		
		obsList = FXCollections.observableArrayList(list);//instanciando o ObservableList
		comboBoxPerson.setItems(obsList);//passando o ObservableList como argumento ao combobobx
		
		//por padrao o combobox vai usar o toString do objeto, para isso vaomos customizar como
		//iremos mostrar os itens do combobox por meio do codigo abaixo
		
		Callback<ListView<Person>, ListCell<Person>> factory = lv -> new ListCell<Person>() {
		    @Override
		    protected void updateItem(Person item, boolean empty) {
		        super.updateItem(item, empty);
		        setText(empty ? "" : item.getName());
		    }
		};

		comboBoxPerson.setCellFactory(factory);
		comboBoxPerson.setButtonCell(factory.call(null));
	}
}