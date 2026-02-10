package device;

public class Device {
    private int id;
    private String brand;
    private String model;
    private static int counter =0;

    public Device(String brand, String model) {
        this.id = ++counter;
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void turnOn(){
        System.out.println("Девайс включается");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Device.counter = counter;
    }

    @Override  // переопределение метода == меняем логику метода в дочернем классе
    public String toString() {
        return "device.Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
