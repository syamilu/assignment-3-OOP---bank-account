public class CheckingAccount extends Account {
    private double insufficientFee = 10;

    public CheckingAccount(double init_balance) {
        super(init_balance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (this.balance < amount) {
            this.balance -= (insufficientFee + amount);
            return false;
        }
        this.balance -= amount;
        return true;
    }
}
