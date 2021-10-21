package gui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController implements Initializable {
	//implementar o Initializabble para implementar o metodo initializable
	
	@FXML
	private TextField txtNumber1;
	
	@FXML
	private TextField txtNumber2;
	
	@FXML
	private Label labelResult;
	
	@FXML
	private Button btSum;
	
	@FXML
	public void onBtSumClick() {
		try {
			Locale.setDefault(Locale.US);
			double height = Double.parseDouble(txtNumber1.getText());
			double width = Double.parseDouble(txtNumber2.getText());
			double sum = height + width;
			labelResult.setText(String.format("%.2f", sum));
		}
		catch (NumberFormatException e) {
			Alerts.showAlert("Error", "Parse error", e.getMessage(), AlertType.ERROR);
		}
	}
	
	
	@FXML
	public void onBtTestAction() {
		System.out.println("click");
		Alerts.showAlert("titulo do alert", "cabeçalho", "conteudo", AlertType.CONFIRMATION);
	}


	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		//este metodo é sempre executado quando o controlador for criado
		//ou seja, quando for criado eu quero que determinadas açoes sejam feitas
		Constraints.setTextFieldDouble(txtNumber1);
		Constraints.setTextFieldMaxLength(txtNumber1, 14);
		Constraints.setTextFieldDouble(txtNumber2);
		Constraints.setTextFieldMaxLength(txtNumber2, 14);
	}
}
