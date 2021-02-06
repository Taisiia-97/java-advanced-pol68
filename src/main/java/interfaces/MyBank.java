package interfaces;

import java.io.Serializable;

public class MyBank implements Bank, Serializable {

    private int balance;


    @Override
    public String credit(int amount) {
        if(amount<0) return "No change. Invalid amount";
        balance+=amount;
        return " Amount changed";
    }

    @Override
    public String debit(int amount) {
        if(amount<0) return "No change. Invalid amount";

        if(balance - amount <0) return "No change. No enough balance.";
        balance-=amount;
        return " Amount changed";
    }

    @Override
    public int balance() {
        return balance;
    }
}
