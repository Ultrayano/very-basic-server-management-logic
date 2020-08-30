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

    private List<Rack> racks = new ArrayList<>();
    private List<Server> servers = new ArrayList<>();
    private List<DataCenter> dataCenters = new ArrayList<>();

    private MainViewController mainViewController = new MainViewController();

    private Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Server Inventarliste");
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
        racks.add(new Rack("BA01"));
        racks.add(new Rack("BA02"));
        racks.add(new Rack("BA03"));
        racks.add(new Rack("ZU01"));
        racks.add(new Rack("ZU02"));

    }
}
