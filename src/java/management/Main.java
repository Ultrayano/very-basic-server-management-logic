package management;


import javafx.application.Application;
import javafx.stage.Stage;
import management.models.DataCenter;
import management.models.Rack;
import management.models.Server;

import java.util.ArrayList;
import java.util.List;


public class Main extends Application {

    private List<Rack> racks = new ArrayList<>();
    private List<Server> servers = new ArrayList<>();
    private List<DataCenter> dataCenters = new ArrayList<>();


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        // Insert JavaFX or insert in FXML
    }

    // To add to "memoryDB" do [ArrayList].add(new Rack(..)) (racks, servers or dataCenters)
    // ex: servers.add(new DataCenter("Basel"));

    // Too load list and print as output in FX

    /*for (Server server : servers) {
        // New FX Element
        // FXElement.setLabel(server.getName);
    }*/

    private void deleteObjectFromLocalDB(List<Object> objectList, Object object) {
        //tbd
        objectList.remove(object);
        // WIP
    }



    private void generateRacks() {
        racks.add(new Rack("BA01"));
        racks.add(new Rack("BA02"));
        racks.add(new Rack("BA03"));
        racks.add(new Rack("ZU01"));
        racks.add(new Rack("ZU02"));

    }
}
