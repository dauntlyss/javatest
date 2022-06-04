import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.application.Application;
import javafx.stage.Stage;
/**
 * @author aharr
 *
 */
public class Main extends Application{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage){
		primaryStage.setTitle("Java FX");
		
		Pane thePane = new Pane();
		Scene theScene = new Scene(thePane);
		primaryStage.setScene(theScene);
		primaryStage.show();
		
	}

}
