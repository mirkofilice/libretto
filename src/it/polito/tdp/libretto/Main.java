package it.polito.tdp.libretto;
	
import it.polito.tdp.libretto.model.Model;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			//loader è l'oggetto che crea il FXML
			FXMLLoader loader= new FXMLLoader(getClass().getResource("Libretto.fxml"));
			
			//questo carica la vista
			BorderPane root = (BorderPane)loader.load();
			
			//mi faccio dare un riferimento al controller creato
			LibrettoController controller= loader.getController();
			
			//creo il modello
			Model model= new Model();
			
			//dico al controller su quale modello lavorare
			controller.setModel(model);
			
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
