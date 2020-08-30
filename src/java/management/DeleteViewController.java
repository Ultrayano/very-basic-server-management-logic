package management;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class DeleteViewController {
    private Main main;
    private String sourceId = "";

    @FXML
    private ComboBox listToDeleteFrom;

    public void setMain(Main main, String sourceId) {
        this.main = main;
        this.sourceId = sourceId;

        if (sourceId.equals("removeServer")) {
            listToDeleteFrom.setItems(FXCollections.observableList(main.getServerNames()));
        } else {
            listToDeleteFrom.setItems(FXCollections.observableList(main.getDataCenterLocations()));
        }

    }

    @FXML
    void delete() {
        if (sourceId.equals("removeServer")) {
            main.getServers().remove(main.getServerByName(listToDeleteFrom.getValue().toString()));
        } else {
            main.getDataCenters().remove(main.getDataCenterByLocation(listToDeleteFrom.getValue().toString()));
        }
    }

    @FXML
    void backTapped(ActionEvent event) {
        this.main.showMainView();
    }
}
