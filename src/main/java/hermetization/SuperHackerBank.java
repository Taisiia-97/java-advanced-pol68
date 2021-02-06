package hermetization;

public class SuperHackerBank extends HermesBank {
    //nadpisujemy metodę aby doprowadzić do ujemnego stanu konta
    @Override
    public String debit(int amount) {
        balance-=amount;
        return "Yes" ;
    }
}
