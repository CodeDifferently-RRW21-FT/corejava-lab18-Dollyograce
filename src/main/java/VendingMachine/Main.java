package VendingMachine;

import java.util.Scanner;

public class Main{

    public void start(){
        Scanner scanner = new Scanner(System.in);
        Terminal terminal = new Terminal();


        Boolean flag = true;
        while(flag) {

            System.out.println();
            System.out.println("WELCOME TO THE TERMINAL ||, PLEASE SELECT FROM OPTIONS: ");
            System.out.println("---------------------------------------------------------");
            System.out.println("Press 1 to Load Credits To Your Card");
            System.out.println("Press 2 to Transfer Balances Between Cards");
            System.out.println("Press 3 to View Your Card's Current Balance");
            System.out.println("Press 4 to Make a Purchase");
            System.out.println("Press 5 to Exit");
            System.out.println();
            System.out.println("---------------------------------------------------------");

            int selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    terminal.addCredits();
                    break;
                case 2:
                   terminal.transferCredits();
                   break;
                case 3:
                    terminal.checkBalance();
                    break;
                case 4:
                    terminal.makePurchase();
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