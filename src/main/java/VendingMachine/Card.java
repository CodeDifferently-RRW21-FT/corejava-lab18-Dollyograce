package VendingMachine;

public class Card {
    private static Integer cardNumberIndex = 1;
    private final Integer Number;
    private Integer balance;

    public Card(Integer balance){
        this.Number = cardNumberIndex;
        cardNumberIndex++;
        this.balance = balance;
    }

    public Integer getNumber() {
        return Number;
    }

    public Integer getBalance() {
        return balance;
    }
    public void setBalance(Integer balance){
        this.balance = balance;
    }


}