package management;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainViewController {
	private Main main;
	
	public void setMain(Main main) {
		this.main = main;
	}


	private Button addServer;
	private Button removeServer;
	private Button addDatacenter;
	private Button removeDatacenter;
	

	@FXML
	void showServerView (ActionEvent event) {
		this.main.showAddServerView();
	}

	@FXML
	void showDeleteView (ActionEvent event) {
		this.main.showDeleteView();
	}

	@FXML
	void showAddDCView (ActionEvent event) {
		this.main.showAddDataCenterView();
	}
}
