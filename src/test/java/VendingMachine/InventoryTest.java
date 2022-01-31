package VendingMachine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InventoryTest {
    @Test
    public void constructorTest01(){
        Inventory inventory = new Inventory(VendingItemsEnum.GRANOLA_BARS,3);
        String expected = "CHIPS, price= 2 credits. ";
        String actual = inventory.toString();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getVendingItemsEnumTest(){
        Inventory inventory = new Inventory(VendingItemsEnum.GRANOLA_BARS,3);
        VendingItemsEnum expected = VendingItemsEnum.GRANOLA_BARS;
        VendingItemsEnum actual = inventory.getName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getPriceTest(){
        Inventory inventory = new Inventory(VendingItemsEnum.GRANOLA_BARS,3);
        Integer expected = 3;
        Integer actual = inventory.getPrice();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getStockTest(){
        Inventory inventory = new Inventory(VendingItemsEnum.GRANOLA_BARS,3);
        Integer expected = 0;
        Integer actual = inventory.getStockChips();

        Assertions.assertEquals(expected, actual);
    }

}
