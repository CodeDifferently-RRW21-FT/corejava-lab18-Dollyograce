package VendingMachine;

public class Inventory {
    private VendingItemsEnum name;
    private Integer price;
    private Integer stock;
    private Integer itemNumber;


    public Inventory(Integer itemNumber, VendingItemsEnum name, Integer price, Integer stock) {
        this.itemNumber = itemNumber;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public VendingItemsEnum getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getStock() {
        return stock;
    }

    public void purchaseItem(){
        stock--;
    }


    @Override
    public String toString() {
        return "Item " + itemNumber + " "+ name + ", price: " + price + " credits " + "stock: " +stock;
    }
}