package VendingMachine;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    private Scanner scanner;
    private Card cardForUser1;
    private Card cardForUser2;

    public Main() {
        scanner = new Scanner(System.in);
        cardForUser1 = new Card(0);
        cardForUser2 = new Card(0);
    }

    public void addCredits() {
        Card currentCard = null;
        System.out.println("Press 1 to add money to card 1");
        System.out.println("Press 2 to add money to card 2");
        int select = scanner.nextInt();
        if (select == 1) {
            System.out.println("Card for user 1 was selected");
            currentCard = cardForUser1;
        } else {
            System.out.println("Card for user 2 was selected");
            currentCard = cardForUser2;
        }
        System.out.println("Current balance of card is " + currentCard.getBalance());
        System.out.println("Please enter an amount in Dollars:");
        int amount = scanner.nextInt();
        currentCard.setBalance(amount * 2);
        System.out.println("Your new current balance of card in credits is " + currentCard.getBalance());
    }

    public void transferCredits() {
        Card currentCard = null;
        System.out.println("Press 1 to transfer with card 1");
        System.out.println("Press 2 to transfer with card 2");
        int select = scanner.nextInt();
        if (select == 1) {
            System.out.println("Card for user 1 was selected");
            int currentBalance = cardForUser1.getBalance();
            System.out.println("Your current balance is : " + currentBalance + " credits.");
            System.out.println("How much would you like to transfer from your card?");
            int creditsTransfer = scanner.nextInt();
            if (creditsTransfer <= currentBalance) {
                cardForUser1.setBalance(cardForUser1.getBalance() - creditsTransfer);
                cardForUser2.setBalance(cardForUser2.getBalance() + creditsTransfer);
                System.out.println("Your current balance for your card is: " + cardForUser1.getBalance() + " credits.");
                System.out.println("Your current balance for User Card 2 is: " + cardForUser2.getBalance() + " credits.");
            } else {
                System.out.println("Insufficient funds, transfer cannot be completed.");
            }
        }
        else if (select == 2) {
            System.out.println("Card for user 2 was selected");
            int currentBalance = cardForUser2.getBalance();
            System.out.println("Your current balance is : " + currentBalance + " credits.");
            System.out.println("How much would you like to transfer from your card?");
            int creditsTransfer = scanner.nextInt();
            if (creditsTransfer <= currentBalance) {
                cardForUser2.setBalance(cardForUser1.getBalance() - creditsTransfer);
                cardForUser1.setBalance(cardForUser2.getBalance() + creditsTransfer);
                System.out.println("Your current balance for your card is: " + cardForUser2.getBalance() + " credits.");
                System.out.println("Your current balance for User Card 1 is: " + cardForUser1.getBalance() + " credits.");
            }
            else  {
                System.out.println("Insufficient funds, transfer cannot be completed.");

            }
        }

    }

    public void checkBalance() {
        System.out.println("Press 1 to check the balance for card 1");
        System.out.println("Press 2 to check the balance for card 2");
        int select = scanner.nextInt();
        if (select == 1) {
            System.out.println("Your card number is: " + cardForUser1.getNumber());
            System.out.println("Your current balance is: " + cardForUser1.getBalance() + " credits.");
        }
            else if (select == 2) {
            System.out.println("Enter your card number: ");
                System.out.println("Your card number is: " + cardForUser2.getNumber());
                System.out.println("Your current balance is: " + cardForUser2.getBalance() + " credits.");
            }
            else
        {
            System.out.println("Enter a valid option between 1 and 2");
        }


        }


    public void makePurchase(){
        Card currentCard = null;
        System.out.println("Press 1 to use card 1");
        System.out.println("Press 2 to use card 2");
        int select = scanner.nextInt();
        if(select == 1){
            System.out.println("Card for user 1 was selected");
            currentCard = cardForUser1;
        }else {
            System.out.println("Card for user 2 was selected");
            currentCard = cardForUser2;
        }
        // Creating all of our vending machine items
        Inventory chips = new Inventory(VendingItemsEnum.CHIPS, 1);
        Inventory cookies = new Inventory(VendingItemsEnum.COOKIES, 2);
        Inventory granolaBars = new Inventory(VendingItemsEnum.GRANOLA_BARS, 3);
        Inventory water = new Inventory(VendingItemsEnum.WATER, 4);
        Inventory soda = new Inventory(VendingItemsEnum.SODA, 5);

        // Loading up the machine with stock
        chips.loadStock();
        System.out.println("1 " + chips + "Current Stock: " + chips.getStockChips());
        System.out.println("2 " + cookies + "Current Stock: " + cookies.getStockCookies());
        System.out.println("3 " + water + "Current Stock: " + water.getStockWater());
        System.out.println("4 " + soda + "Current Stock: " + soda.getStockSoda());
        System.out.println("5 " + granolaBars + "Current Stock: " + granolaBars.getStockGranolaBars());
        if (currentCard.getBalance() <= 0) {
            System.out.println("Insufficient balance, please add funds to your card");
        } else {
            System.out.println("Please make a selection");
            int selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    currentCard.setBalance(currentCard.getBalance() - chips.getPrice());
                    chips.purchaseChips();
                    System.out.println("You have selected chips, dispensing your item...");
                    // Need to print out a receipt with card #, item purchased, and new balance
                    System.out.println("Card number: " + currentCard.getNumber());
                    System.out.println("Item purchased: " + chips.getName());
                    System.out.println("New card balance: " + currentCard.getBalance());
                    break;
                case 2:
                    currentCard.setBalance(currentCard.getBalance() - cookies.getPrice());
                    cookies.purchaseCookies();
                    System.out.println("You have selected M&M's, dispensing your item...");
                    System.out.println("Card number: " + currentCard.getNumber());
                    System.out.println("Item purchased: " + cookies.getName());
                    System.out.println("New card balance: " + currentCard.getBalance());
                    break;
                case 3:
                    currentCard.setBalance(currentCard.getBalance() - water.getPrice());
                    water.purchaseWater();
                    System.out.println("You have selected Water, dispensing your item...");
                    System.out.println("Card number: " + currentCard.getNumber());
                    System.out.println("Item purchased: " + water.getName());
                    System.out.println("New card balance: " + currentCard.getBalance());
                    break;
                case 4:
                    currentCard.setBalance(currentCard.getBalance() - soda.getPrice());
                    soda.purchaseSoda();
                    System.out.println("You have selected Soda, dispensing your item...");
                    System.out.println("Card number: " + currentCard.getNumber());
                    System.out.println("Item purchased: " + soda.getName());
                    System.out.println("New card balance: " + currentCard.getBalance());
                    break;
                case 5:
                    currentCard.setBalance(currentCard.getBalance() - granolaBars.getPrice());
                    granolaBars.purchaseGranolaBars();
                    System.out.println("You have selected Granola Bars, dispensing your item...");
                    System.out.println("Card number: " + currentCard.getNumber());
                    System.out.println("Item purchased: " + granolaBars.getName());
                    System.out.println("New card balance: " + currentCard.getBalance());
                    break;
                default:
                    System.out.println("Select a valid item to purchase");
            }
        }
    }


    public void start(){
        Boolean flag = true;
        while(flag) {

            System.out.println("WELCOME TO THE TERMINAL ||, PLEASE SELECT FROM OPTIONS: ");
            System.out.println("---------------------------------------------------------");
            System.out.println("Press 1 to load credits to your card");
            System.out.println("Press 2 to transfer balances between cards");
            System.out.println("Press 3 to view your card's current balance");
            System.out.println("Press 4 to make a purchase");
            System.out.println("Press 5 to exit");
            System.out.println();
            System.out.println("---------------------------------------------------------");

            int selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    addCredits();
                    break;
                case 2:
                   transferCredits();
                   break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    makePurchase();
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("You selected a unknown option.");
            }
        }

    }
    public static void main(String[] args) {
        Main main = new Main();
        main.start();

    }
}