package management;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class AddServerViewController {
	private Main main;

	@FXML
	ComboBox racks;
	@FXML
	ComboBox dataCenter;


	public void setMain(Main main) {
		this.main = main;
		racks.setItems(FXCollections.observableList(main.getRackNames()));
		dataCenter.setItems(FXCollections.observableList(main.getDataCenterLocations()));
	}

	@FXML
	void backTapped(ActionEvent event) {
		this.main.showMainView();
	}
}
