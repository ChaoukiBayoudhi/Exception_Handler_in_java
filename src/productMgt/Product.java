package productMgt;

import lombok.Getter;
import lombok.Setter;
import providerMgt.Provider;

import java.time.LocalDate;
import java.util.Objects;
@Getter //generates all getters for all attributes
@Setter //generates all setters for all attributes
public class Product {
    private long id;
    private static long lastId=0;

    private String label;
    private double price;
    private LocalDate fabricationDate;
    private LocalDate expirationDate;
    private int stock;
    private String description;
    //private byte[] photo;
    private String photo; //just the photo's path
    private Provider productProvider;

    public Product() {
        this.id = ++lastId;
    }

    public Product(String label, double price, LocalDate fabricationDate, LocalDate expirationDate, int stock, String description, String photo, Provider productProvider) {
        this.label = label;
        this.price = price;
        this.fabricationDate = fabricationDate;
        this.expirationDate = expirationDate;
        this.stock = stock;
        this.description = description;
        this.photo = photo;
        this.productProvider = productProvider;
    }
}
