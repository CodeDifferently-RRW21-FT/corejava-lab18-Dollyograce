package VendingMachine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InventoryTest {
    @Test
    public void constructorTest01(){
        Inventory inventory = new Inventory(1, VendingItemsEnum.GRANOLA_BARS,3, 1);
        String expected = "Item 1 GRANOLA_BARS, price: 3 credits stock: 1";
        String actual = inventory.toString();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getVendingItemsEnumTest(){
        Inventory inventory = new Inventory(1, VendingItemsEnum.GRANOLA_BARS,3, 1);
        VendingItemsEnum expected = VendingItemsEnum.GRANOLA_BARS;
        VendingItemsEnum actual = inventory.getName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getPriceTest(){
        Inventory inventory = new Inventory(1, VendingItemsEnum.GRANOLA_BARS,3, 1);
        Integer expected = 3;
        Integer actual = inventory.getPrice();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getStockTest(){
        Inventory inventory = new Inventory(1, VendingItemsEnum.GRANOLA_BARS,3, 1);
        Integer expected = 1;
        Integer actual = inventory.getStock();

        Assertions.assertEquals(expected, actual);
    }


}
