public class App {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 1200, 50);
        Product smartphone = new Product("Smartphone",800, 80);

        StoreShop store = new StoreShop();
        store.setInventory(laptop);
        store.setInventory(smartphone);

        for (int i = 0; i < 5; i++) {
            store.sale(laptop);
        }
        for (int i = 0; i < 10; i++) {
            store.sale(smartphone);
        }
        store.getInventory()[0].getStock();



    }
}