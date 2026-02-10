package product;

import java.time.LocalDate;

public class Book extends Product{
    private String authorName;


    public Book(String name, String description, int price, LocalDate createdDate, String type, int productCount) {
        super(name, description, price, createdDate, type, productCount);
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id = " + this.getId() + '\n' +
                "authorName='" + authorName + '\'' +
                ", description='" + this.getDescription() + '\'' +
                ", price=" + this.getPrice() +
                ", createdDate=" + this.getCreatedDate() +
                ", type='" + this.getType() + '\'' +
                ", productCount=" + this.getProductCount() +
                '}';
    }
}
