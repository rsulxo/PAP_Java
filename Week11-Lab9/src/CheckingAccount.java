public class CheckingAccount extends Account{
    private int numberOfChecksUsed;     // stores the numbers of checks used every month, starts at zero

    // We assume that the initial balance won’t be negative.
    // You are required to use the keyword super.
    public CheckingAccount(String id, double initialBalance){
        super(id, initialBalance);
        numberOfChecksUsed = 0;
        this.balance = initialBalance;
    }

    // Implement the withdraw method via ATMs to take out the provided amount from the account balance.
    // Incorporate the transaction fee for ATM/electronic withdrawals. A withdrawal that potentially lowers
    // the balance below £0 is not allowed. In such cases the balance remains unchanged but the method
    // returns false. The method returns true if the withdrawal is successful.
    public boolean withdraw(double amount){
        if (balance - amount - 1 >= 0) {
            balance = balance - amount - 1;
            return true;
        } else {
            return false;
        }
    }

    // The provided amount is added to the account as a result of an ATM transaction.
    // Applicable transaction fees are deducted from the balance.
    public void deposit(double amount) {
        balance = balance + amount - 1;
    }

    // This method resets the numberOfChecksUsed to zero.
    public void resetChecksUsed() {
        numberOfChecksUsed = 0;
    }

    // Returns the value of numberOfChecksUsed.
    public int getChecksUsed() {
        return numberOfChecksUsed;
    }


    // This method allows one to use checks to withdraw cash. It updates the balance according
    // to the rules described above. If the balance could fall below - £10 because of the amount
    // and/or fees, the method doesn’t change the balance, does not increment the number of
    // checks used but just returns false. A successful withdrawal results in updating the balance
    // and number of checks used, and the method returns true.
    public boolean withdrawUsingCheck(double amount){
        if(amount < 10) return false;
        int fee;
        if(getChecksUsed()+1 > 3){
            fee = 2;
        } else {
            fee = 0;
        }

        if(balance - amount - fee >= 10){
            balance = balance - amount - fee;
            this.numberOfChecksUsed+=1;
            return true;
        } else {
            return false;
        }
    }
}
