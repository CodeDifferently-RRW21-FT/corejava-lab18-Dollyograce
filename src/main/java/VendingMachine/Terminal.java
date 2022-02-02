package VendingMachine;

import java.util.ArrayList;
import java.util.Scanner;

public class Terminal {
    ArrayList<Card> userCardArray = new ArrayList<>();
    ArrayList<Inventory> vendingItemsArray = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Card currentCard;
    Card destinationCard;


    public Terminal() {
        userCardArray.add(new Card(100));
        userCardArray.add(new Card(200));
        userCardArray.add(new Card(300));
        userCardArray.add(new Card(400));
        userCardArray.add(new Card(500));


    }

    public void addCredits() {
        System.out.println("Which card would you like to use?");
        System.out.println("Pick a card from 1-5");
        int select = scanner.nextInt();
        currentCard = userCardArray.get(select - 1);
        System.out.println("Current balance on card is " + currentCard.getBalance() + " credits.");
        System.out.println("Please enter an amount in Dollars:");
        int amount = scanner.nextInt();
        currentCard.setBalance(amount * 2);

        System.out.println("Card for user " + select + " was selected.");
        System.out.println("Your new current balance is " + currentCard.getBalance() + " credits.");
    }

    public void transferCredits() {
        //Card currentCard = null;
        //Card destinationCard = null;
        System.out.println("Which card would you like to use?");
        System.out.println("Pick a card from 1-5");
        int input = scanner.nextInt();
        currentCard = userCardArray.get(input - 1);
        System.out.println("And which card would you like to transfer the balance to? 1-5");
        int input2 = scanner.nextInt();
        destinationCard = userCardArray.get(input2 - 1);

        //Initiate transfer
        System.out.println("How many credits would you like to transfer?");
        int amount = scanner.nextInt();
        currentCard.setBalance(currentCard.getBalance() - amount);
        destinationCard.setBalance(destinationCard.getBalance() + amount);
        System.out.println("Task complete: The balance of Card " + input2 + " is now " + destinationCard.getBalance());
        System.out.println("The balance of Card " + input + " is now " + currentCard.getBalance() + " credits.");
    }


    public void checkBalance() {
       // Card currentCard = null;
        System.out.println("Which card would you like to use?");
        System.out.println("Pick a card from 1-5");

        int select = scanner.nextInt();
        currentCard = userCardArray.get(select - 1);
        System.out.println("Card for user " + select + "was selected.");

        int cardBalance = currentCard.getBalance();
        String currentBalance = "Your current card for user " + select + " is: " + cardBalance + " credits.";
        System.out.println(currentBalance);
    }


    public void makePurchase() {
        System.out.println("Which card would you like to use?");
        System.out.println("Pick a card from 1-5");
        int select = scanner.nextInt();
        currentCard = userCardArray.get(select - 1);
        System.out.println("Card for user " + select + " was selected");
        System.out.println("Current balance of card is " + currentCard.getBalance() + " credits.");

        // Creating items currently in the vending machine

        Inventory chips = new Inventory(1, VendingItemsEnum.CHIPS, 2, 10);
        Inventory cookies = new Inventory(2, VendingItemsEnum.COOKIES, 2, 10);
        Inventory granolaBars = new Inventory(3, VendingItemsEnum.GRANOLA_BARS, 4, 10);
        Inventory water = new Inventory(4, VendingItemsEnum.WATER, 3, 10);
        Inventory soda = new Inventory(5, VendingItemsEnum.SODA, 3, 10);

        vendingItemsArray.add(chips);
        vendingItemsArray.add(cookies);
        vendingItemsArray.add(granolaBars);
        vendingItemsArray.add(water);
        vendingItemsArray.add(soda);

        System.out.println("Please select a number from the options below: ");
        for (Inventory index : vendingItemsArray)
            System.out.println(index);

        if (currentCard.getBalance() <= 0) {
            System.out.println("Insufficient balance, please add funds to your card");
        } else {
            System.out.println("Please make a selection");
            int selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    currentCard.setBalance(currentCard.getBalance() - chips.getPrice());
                    chips.purchaseItem();
                    System.out.println("You have selected Chips, dispensing your item...");
                    // Need to print out a receipt with card #, item purchased, and new balance
                    System.out.println("Card number: " + currentCard.getNumber());
                    System.out.println("Item purchased: " + chips.getName());
                    System.out.println("New card balance: " + currentCard.getBalance() + " credits.");
                    break;
                case 2:
                    currentCard.setBalance(currentCard.getBalance() - cookies.getPrice());
                    cookies.purchaseItem();
                    System.out.println("You have selected Cookies, dispensing your item...");
                    System.out.println("Card number: " + currentCard.getNumber());
                    System.out.println("Item purchased: " + cookies.getName());
                    System.out.println("New card balance: " + currentCard.getBalance() + " credits.");
                    break;
                case 3:
                    currentCard.setBalance(currentCard.getBalance() - granolaBars.getPrice());
                    granolaBars.purchaseItem();
                    System.out.println("You have selected Granola Bars, dispensing your item...");
                    System.out.println("Card number: " + currentCard.getNumber());
                    System.out.println("Item purchased: " + granolaBars.getName());
                    System.out.println("New card balance: " + currentCard.getBalance() + " credits.");
                    break;
                case 4:
                    currentCard.setBalance(currentCard.getBalance() - water.getPrice());
                    water.purchaseItem();
                    System.out.println("You have selected Soda, dispensing your item...");
                    System.out.println("Card number: " + currentCard.getNumber());
                    System.out.println("Item purchased: " + water.getName());
                    System.out.println("New card balance: " + currentCard.getBalance() + " credits.");
                    break;
                case 5:
                    currentCard.setBalance(currentCard.getBalance() - soda.getPrice());
                    soda.purchaseItem();
                    System.out.println("You have selected Soda, dispensing your item...");
                    System.out.println("Card number: " + currentCard.getNumber());
                    System.out.println("Item purchased: " + soda.getName());
                    System.out.println("New card balance: " + currentCard.getBalance() + " credits.");
                    break;
                default:
                    System.out.println("Select a valid item to purchase");
            }
        }
    }
}