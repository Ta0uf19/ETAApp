package InterfaceClient;
import java.io.IOException;

import DAO.Login;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;


public class LoginController extends MainController {
	
	@FXML private Label message;
	@FXML private TextField user;
	@FXML private TextField password;
	private static String sessionId;
	
	public void Login(ActionEvent event) throws IOException {
		/*
		 * Si login valid� => charg� le menu
		 */
		Login log = new Login();
		if(log.isValid(user.getText(), password.getText())) {
			
			/*
			 * Maximized size
			 */
			Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
			window.setMaximized(true);

			sessionId = user.getText();
			Parent root = FXMLLoader.load(getClass().getResource("/InterfaceClient/view/Menu.fxml"));
			this.setNode(root);
			
			 

		}
		else {
			message.setStyle("-fx-text-fill: #f00");
			message.setText("Erreur de connexion");
		}
	}
	
	public static String getSession() {
		return sessionId;
	}

	
}

