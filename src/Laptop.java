public class Laptop extends Device {

    public Laptop(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void turnOn() {
        System.out.println("Ноутбук бренда " + super.getBrand() + " включается");
    }
}
