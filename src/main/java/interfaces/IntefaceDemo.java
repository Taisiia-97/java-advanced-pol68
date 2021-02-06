package interfaces;

public class IntefaceDemo {
    public static void main(String[] args) {
        Bank bank = new MyBank();
        System.out.println(bank.credit(100));
        System.out.println(bank.debit(500));
        System.out.println("Stan konta: "+bank.balance());
    }
}
