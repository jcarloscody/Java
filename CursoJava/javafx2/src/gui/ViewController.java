package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewController {
	
	@FXML   //É Assim que declara uma atributo correspondente ao controle(bobtao, label..._) da tela
	private Button btTest;
	
	
	@FXML
	public void onBtTestAction() {
		System.out.println("click");
		Alerts.showAlert("titulo do alert", "cabeçalho", "conteudo", AlertType.CONFIRMATION);
	}
}
