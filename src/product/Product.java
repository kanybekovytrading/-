package product;

import java.time.LocalDate;

public class Product {
    private int id;
    private String name;
    private String description;
    private int price;
    private LocalDate createdDate;
    private String type;
    private int productCount;
    private static int counter=0;

    public Product(String name, String description, int price, LocalDate createdDate, String type, int productCount) {
        this.id = counter++;
        this.name = name;
        this.description = description;
        this.price = price;
        this.createdDate = createdDate;
        this.type = type;
        this.productCount = productCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", createdDate=" + createdDate +
                ", type='" + type + '\'' +
                ", productCount=" + productCount +
                '}';
    }
}
