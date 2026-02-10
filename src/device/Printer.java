package device;

public class Printer extends Device {
    private int pages;
    public Printer(String brand, String model, int pages) {
        super(brand, model);
        this.pages = pages;
    }

    @Override
    public void turnOn() {
        System.out.println(this.getBrand() + " " + this.getModel() + " " + " включается");
    }

    @Override
    public String toString() {
        return super.toString() + "pages: " + this.pages;
    }
}
