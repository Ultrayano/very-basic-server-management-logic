package management;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import management.models.Server;

public class MainViewController {
    private Main main;

    @FXML
    TableView table;

    @FXML
    TableColumn<Server, String> name;
    @FXML
    TableColumn<Server, String> model;
    @FXML
    TableColumn<Server, String> dataCenter;
    @FXML
    TableColumn<Server, String> rack;
    @FXML
    TableColumn<Server, String> he;

    public void setMain(Main main) {
        this.main = main;
        for (Server server : main.getServers()) {
            name.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getName()));
            model.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getModel()));
            dataCenter.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDataCenter().getLocation()));
            rack.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getRack().getName()));
            he.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getHe()));

            table.setItems(FXCollections.observableList(main.getServers()));
        }


    }

    @FXML
    void showServerView(ActionEvent event) {
        this.main.showAddServerView();
    }

    @FXML
    void showDeleteView(ActionEvent event) {
        Button button = (Button) event.getSource();
        String sourceId = button.getId();

        this.main.showDeleteView(sourceId);
    }

    @FXML
    void showAddDCView(ActionEvent event) {
        this.main.showAddDataCenterView();
    }
}
