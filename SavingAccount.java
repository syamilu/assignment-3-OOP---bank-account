public class SavingAccount extends Account {
    private double annualInterest = 0.0025;// 2.5% per year, need to be divided by 12

    public SavingAccount(double init_balance) {
        super(init_balance);
    }

    public boolean monthlyInterestDeposit(double amount) {
        amount += amount * annualInterest / 12;
        this.balance += amount;
        return true;
    }

    @Override
    public boolean withdraw(double amount) {
        if (this.balance < amount) {
            return false;
        }
        this.balance -= amount;
        return true;
    }

}
