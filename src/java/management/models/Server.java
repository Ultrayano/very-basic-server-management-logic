package management.models;

public class Server {
    public String name;
    public String model;
    public DataCenter dataCenter;
    public Rack rack;
    public int he;

    public Server(String name, String model, DataCenter dataCenter, Rack rack, int he) {
        this.name = name;
        this.model = model;
        this.dataCenter = dataCenter;
        this.rack = rack;
        this.he = he;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public DataCenter getDataCenter() {
        return dataCenter;
    }

    public void setDataCenter(DataCenter dataCenter) {
        this.dataCenter = dataCenter;
    }

    public Rack getRack() {
        return rack;
    }

    public void setRack(Rack rack) {
        this.rack = rack;
    }

    public int getHe() {
        return he;
    }

    public void setHe(int he) {
        this.he = he;
    }
}
