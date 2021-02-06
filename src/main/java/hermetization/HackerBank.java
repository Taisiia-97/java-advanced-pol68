package hermetization;
// aby nie można było podmienić w miejsce Gringotbank klasy wyprowadzonej
//należy doadać final przed klasą
public class HackerBank  extends GringotBank{
    @Override
    public String debit(int amount) {
        // nie możemy dostać sie do pola balance
        //możemu tylko zasymulowac wpłate
super.debit(amount);
        return "Balance changed";
    }
}
