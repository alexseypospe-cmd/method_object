import java.util.Objects;

public class Product {
    int id;
    String name;
    int price;
    String category;
    public Product(int id, String name, int price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }
    @Override
    public String toString() {
        return "Товар[артикул=" + id + ", название=" + name + ", цена=" + price + ", категория=" + category + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return id == product.id && Objects.equals(category, product.category);
    }
    public int getId() {
        return id; }
    public String getName() {
        return name; }
    public int getPrice() {
        return price; }
    public String getCategory() {
        return category; }





}
