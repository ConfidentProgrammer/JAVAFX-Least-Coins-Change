package change;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RunApp extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   launch(args);
	}

	@Override
	public void start(Stage ps) throws Exception {
		// TODO Auto-generated method stub
		URL res = this.getClass().getResource("layout.fxml");
		Parent xmlScene = FXMLLoader.load(res);
        Scene myScene = new Scene(xmlScene);		
		ps.setScene(myScene);
		ps.setTitle("Calculate Change");
		ps.show();
	}

}
