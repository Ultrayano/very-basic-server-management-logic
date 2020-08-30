package management;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import management.models.Server;

public class AddServerViewController {
    private Main main;


    @FXML
    TextField serverName;
    @FXML
    TextField model;
    @FXML
    ComboBox racks;
    @FXML
    ComboBox dataCenter;
    @FXML
    TextField he;


    public void setMain(Main main) {
        this.main = main;
        racks.setItems(FXCollections.observableList(main.getRackNames()));
        dataCenter.setItems(FXCollections.observableList(main.getDataCenterLocations()));
    }

    @FXML
    void backTapped(ActionEvent event) {
        this.main.showMainView();
    }

    @FXML
    void save() {
        main.getServers().add(
                new Server(serverName.getText(),
                        model.getText(),
                        main.getDataCenterByLocation(dataCenter.getValue().toString()),
                        main.getRackByName(racks.getValue().toString()),
                        he.getText())
        );
    }
}
