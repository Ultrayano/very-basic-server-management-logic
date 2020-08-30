package management;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class MainViewController {
	private Main main;

	private Button addServer;
	private Button removeServer;
	private Button addDatacenter;
	private Button removeDatacenter;
	
	void showServerView (ActionEvent event) {
		this.main.showAddServerView();
	}
}
