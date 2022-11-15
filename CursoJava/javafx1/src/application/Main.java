package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	/*basicamente uma classe afex extende de Application
	 * 
	 * essa classe tem o metodo abstrato que é o start 
	 * 
	 * a classe Application tem o metodo init (que podemos colocar coisas nele que devem acontecer
	 * antes da app inicia) e o stop(que acontece depois que a app encerrar)
	 * 
	 * o metodo start é obrigatorio implementar
	 * */
	/*@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane(); //obj de painel
			Scene scene = new Scene(root,400,400);//obj de cena 
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}*/
	
	@Override
	public void start(Stage stage) {
		try {
			 Parent parent = FXMLLoader.load(getClass().getResource("/gui/View.fxml"));//CHAMANDO O ARQUIVO View
			 Scene scene = new Scene(parent);//cria a cena
			 stage.setScene(scene);//inclui a cena no palco
			 stage.show();//mostra o palco
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		//aqui começa a app
		launch(args);
		/*chama o metodo Launch, que é o metodo static que tem na classe applicaiton
		 * uqe serve para iniciar a app fex*/
	}
}
