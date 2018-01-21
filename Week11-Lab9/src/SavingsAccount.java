public class SavingsAccount extends Account{

    // We assume that initial deposit will be greater or equal to £10.
    // If the initial deposit is £1000 or above,
    // the bank credits the account with an extra £10.00
    public SavingsAccount(String id, double initialDeposit){
        super(id, initialDeposit);

        if (initialDeposit >= 1000) {
            balance = balance + 10;
        }
    }

    // Implement the withdraw method to take out the provided amount from the account balance.
    // you are required take into account the withdrawal transaction fee.
    // the withrawing fee per transaction is £3. In addition to this, the account balance should
    // always be at least £10 after the withdrawal and if not the transaction is not allowed.
    @Override
    public boolean withdraw(double amount) {
        if (balance - amount - 3 >= 10){
            balance = balance - amount - 3;
            return true;
        } else {
            return false;
        }
    }

    // This an ATM transaction with no fees, it adds amount to the account balance.
    public void deposit(double amount){
        balance += amount;
    }

    // This methods computes interest, adds the inter- est to account balance and returns the
    // interest. The monthly rate is provided as a percentage. The caller of this method decides
    // when the interest is due to be added.
    public double addInterest(double rate){
        double interest = (balance / 100) * rate;
        balance += interest;
        return interest;
    }
}

