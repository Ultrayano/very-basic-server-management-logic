package management;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import management.models.DataCenter;

public class AddDataCenterViewController {
    private Main main;

    @FXML
    TextField dataCenterLocation;

    public void setMain(Main main) {
        this.main = main;
    }

    @FXML
    void backTapped(ActionEvent event) {
        this.main.showMainView();
    }

    @FXML
    void save() {
        main.getDataCenters().add(
                new DataCenter(dataCenterLocation.getText()));
    }
}
