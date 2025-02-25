public class StoreShop {
    private int balance;
    private Product[] inventory;

    StoreShop(){
        this.balance = 500000;
        inventory = new Product[0];
    }

    public int getBalance() {
        return balance;
    }

    public void setInventory(Product product) {
        Product[] newInventory = new Product[this.inventory.length + 1];
        for (int i = 0; i < this.inventory.length; i++) {
            newInventory[i] = this.inventory[i];
        }
        newInventory[newInventory.length - 1] = product;

        this.inventory = newInventory;
    }

    public Product[] getInventory(){
        return this.inventory;
    }

    public void sale (Product p1){
        this.balance += p1.getPrice();
        p1.setStock(p1.getStock() - 1);
    }


    public void checkBudget(){
            int sum = 0;
        for(Product p1 : this.inventory){

        }
    }
}
