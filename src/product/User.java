package product;

import java.util.Arrays;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Product[] products;
    private static int counter =0;
    private int count;

    public User() {
        this.id=counter++;
    }
    public User(String firstName, String lastName, String email, String password, Product[] products) {
        this.id = counter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.products = products;
        count =0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        User.counter = counter;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", products=" + Arrays.toString(products) +
                '}';
    }

    public String addProduct(Product product) {
        if (count < products.length) {
            products[count++] = product;
        }
        return "Добавлен продукт "+ products[count];
    }
    public void getAllProducts() {
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }

    public void getElectronics(){
        for(int i=0; i< products.length;i++ ){
            if(products[i].getClass().getName().equalsIgnoreCase("Electronics")){
                System.out.println(products[i]);
            }
        }

    }

    public void getBooks(){

    }
}



