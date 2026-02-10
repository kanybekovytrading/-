package product;

import java.time.LocalDate;

public class Electronics extends Product{
    private String brand;
    private String color;
    private boolean isNew;
    private int memory;


    public Electronics(String name, String description, int price, LocalDate createdDate, String type, int productCount) {
        super(name, description, price, createdDate, type, productCount);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", isNew=" + isNew +
                ", memory=" + memory +
                ", id=" + this.getId() +
                ", description='" + this.getDescription() + '\'' +
                ", price=" + this.getPrice() +
                ", createdDate=" + this.getCreatedDate() +
                ", type='" + this.getType() + '\'' +
                ", productCount=" + this.getProductCount() +
                '}';
    }
}
