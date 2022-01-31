package VendingMachine;

public class Inventory {
    private VendingItemsEnum name;
    private Integer price;
    private static Integer stockChips = 0;
    private static Integer stockCookies = 0;
    private static Integer stockGranolaBars = 0;
    private static Integer stockWater = 0;
    private static Integer stockSoda = 0;


    public Inventory(VendingItemsEnum name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public VendingItemsEnum getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public void loadStock() {
        stockChips += 5;
        stockCookies += 5;
        stockGranolaBars += 5;
        stockWater += 5;
        stockSoda += 5;


    }

    public Integer getStockChips() {
        return stockChips;
    }

    public Integer getStockCookies() {
        return stockCookies;
    }

    public Integer getStockWater() {
        return stockWater;
    }

    public Integer getStockSoda() {
        return stockSoda;
    }

    public Integer getStockGranolaBars() {
        return stockGranolaBars;
    }

    public Integer purchaseChips() {
        stockChips--;
        return stockChips;
    }

    public Integer purchaseCookies() {
        stockCookies--;
        return stockCookies;
    }

    public Integer purchaseGranolaBars(){
        stockGranolaBars--;
        return stockGranolaBars;
    }
    public Integer purchaseWater(){
        stockWater--;
        return stockWater;
    }
    public Integer purchaseSoda(){
        stockSoda--;
        return stockSoda;
    }


    @Override
    public String toString() {
        return name + ", price= " + price + " credits. ";
    }

}
