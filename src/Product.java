public class Product {
    private String name;
    private int price;
    private int stock;


    Product(String name,int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock(){
        return this.stock;
    }

}
