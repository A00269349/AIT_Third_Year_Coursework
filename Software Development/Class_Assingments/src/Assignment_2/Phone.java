package Assignment_2;

import java.io.Serializable;

public class Phone implements Serializable{

    private String make;
    private String model;
    private int memory;
    private double camera;
    private double screen_size;
    private boolean smart;
    private int price;

    public Phone(String make, String model, int memory, double camera, double screen_size, boolean smart, int price) {
        this.make = make;
        this.model = model;
        this.memory = memory;
        this.camera = camera;
        this.screen_size = screen_size;
        this.smart = smart;
        this.price = price;
    }


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getMemory() {
        return memory;
    }

    public double getCamera() {
        return camera;
    }

    public double getScreen_size() {
        return screen_size;
    }

    public boolean getSmart() {
        return smart;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return
                make   + "" +
                model  + " " +
                memory + " " +
                camera + " " +
                screen_size   + " " +
                smart  + " " +
                price;

    }
}
