package productMgt;

import providerMgt.Provider;

import java.time.LocalDate;
import java.util.Objects;

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
        this.id=++lastId;
        this.label="";
        this.price=0;
        this.fabricationDate=null;
        //this.expirationDate=LocalDate.now();
        this.expirationDate=null;
        this.stock=0;
        this.description="";
        this.photo="";
        this.productProvider =new Provider();
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


    public String getLabel() {
        return label;
    }

    public Provider getProductProvider() {
        return productProvider;
    }

    public void setProductProvider(Provider productProvider) {
        this.productProvider = productProvider;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getFabricationDate() {
        return fabricationDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public int getStock() {
        return stock;
    }

    public String getDescription() {
        return description;
    }

    public String getPhoto() {
        return photo;
    }

    public long getId() {
        return id;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setFabricationDate(LocalDate fabricationDate) {
        this.fabricationDate = fabricationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", price=" + price +
                ", fabricationDate=" + fabricationDate +
                ", expirationDate=" + expirationDate +
                ", stock=" + stock +
                ", description='" + description + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return label.equals(product.label) && fabricationDate.equals(product.fabricationDate) && expirationDate.equals(product.expirationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label, fabricationDate, expirationDate);
    }
}
