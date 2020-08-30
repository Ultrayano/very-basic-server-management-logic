package management;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import management.models.Rack;

public class AddDataCenterViewController {
	private Main main;

	public void setMain(Main main) {
		this.main = main;
	}
	
	@FXML
	void backTapped(ActionEvent event) {
		this.main.showMainView();
	}
}
