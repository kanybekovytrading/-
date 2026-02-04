public class Smartphone extends Device{
    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void turnOn() {
        System.out.println("Телефон бренда " + super.getBrand() + " включается");

    }
}
