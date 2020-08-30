package management;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class DeleteViewController {
	private Main main;

	@FXML
	private ComboBox listToDeleteFrom;

	public void setMain(Main main, String sourceId) {
		this.main = main;

		if (sourceId.equals("removeServer")) {
			listToDeleteFrom.setItems(FXCollections.observableList(main.getServerNames()));
		}
		else {
			listToDeleteFrom.setItems(FXCollections.observableList(main.getDataCenterLocations()));
		}

	}
}
