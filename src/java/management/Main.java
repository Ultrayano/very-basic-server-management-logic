package management;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import management.models.DataCenter;
import management.models.Rack;
import management.models.Server;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main extends Application {

    private List<Rack> rackList = new ArrayList<>();
    private List<Server> servers = new ArrayList<>();
    private List<DataCenter> dataCenters = new ArrayList<>();

    private Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Server Inventarliste");
        this.generateRacks();
        this.showMainView();
    }

    public void showMainView() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../resources/fxml/MainView.fxml"));

            // Show the scene containing the root layout.
            Scene scene = new Scene(loader.load());
            primaryStage.setScene(scene);
            primaryStage.show();

            MainViewController controller = loader.getController();
            controller.setMain(this);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showAddServerView() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../resources/fxml/AddServerView.fxml"));

            // Show the scene containing the root layout.
            Scene scene = new Scene(loader.load());
            primaryStage.setScene(scene);
            primaryStage.show();

            AddServerViewController controller = loader.getController();
            controller.setMain(this);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showAddDataCenterView() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../resources/fxml/AddDCView.fxml"));

            // Show the scene containing the root layout.
            Scene scene = new Scene(loader.load());
            primaryStage.setScene(scene);
            primaryStage.show();

            AddDataCenterViewController controller = loader.getController();
            controller.setMain(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showDeleteView(String sourceId) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../resources/fxml/DeleteView.fxml"));

            // Show the scene containing the root layout.
            Scene scene = new Scene(loader.load());
            primaryStage.setScene(scene);
            primaryStage.show();


            DeleteViewController controller = loader.getController();
            controller.setMain(this, sourceId);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteObjectFromLocalDB(List<Object> objectList, Object object) {
        //tbd
        objectList.remove(object);
        // WIP
    }

    private void generateRacks() {
        rackList.add(new Rack("BA01"));
        rackList.add(new Rack("BA02"));
        rackList.add(new Rack("BA03"));
        rackList.add(new Rack("ZU01"));
        rackList.add(new Rack("ZU02"));
    }

    public List<String> getServerNames() {
        List<String> serverNames = new ArrayList<>();
        for (Server server : servers) {
            serverNames.add(server.getName());
        }
        return serverNames;
    }

    public List<String> getRackNames() {
        List<String> rackNames = new ArrayList<>();
        for (Rack rack : rackList) {
            rackNames.add(rack.getName());
        }
        return rackNames;
    }

    public List<String> getDataCenterLocations() {
        List<String> dataCenterLocations = new ArrayList<>();
        for (DataCenter dataCenter : dataCenters) {
            dataCenterLocations.add(dataCenter.getLocation());
        }
        return dataCenterLocations;
    }

    public List<Server> getServers() {
        return servers;
    }

    public List<DataCenter> getDataCenters() {
        return dataCenters;
    }

    public Rack getRackByName(String name) {
        Rack foundRack = null;
        for (Rack rack : rackList) {
            if (rack.getName().equals(name)) {
                foundRack = rack;
            }
        }
        return foundRack;
    }

    public Server getServerByName(String name) {
        Server foundServer = null;
        for (Server server : servers) {
            if (server.getName().equals(name)) {
                foundServer = server;
            }
        }
        return foundServer;
    }

    public DataCenter getDataCenterByLocation(String location) {
        DataCenter foundDataCenter = null;
        for (DataCenter dataCenter : dataCenters) {
            if (dataCenter.getLocation().equals(location)) {
                foundDataCenter = dataCenter;
            }
        }
        return foundDataCenter;
    }
}
