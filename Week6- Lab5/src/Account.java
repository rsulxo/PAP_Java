public class Account {

    // three instance variables
    String name;
    int accountNumber;
    double balance;

    //constructors
    Account(String n) {
        this.name = n;
    }

    Account(String n, int a) {
        this.name = n;
        this.accountNumber = a;
    }

    Account(String n, double b) {
        this.name = n;
        this.balance = b;
    }

    Account(String n, int a, double b) {
        this.name = n;
        this.accountNumber = a;
        this.balance = b;
    }

    //setters
    void setName(String n) {

        this.name = n;
    }

    void setAccountNumber(int a) {

        this.accountNumber = a;
    }

    void setBalance(double b) {

        this.balance = b;
    }

    //getters
    String getName() {

        return this.name;
    }

    int getAccountNumber() {

        return this.accountNumber;
    }

    double getBalance() {

        return this.balance;
    }

    //transactions
    public double Deposit(double d) {
        //this then returns the updated balance value
        this.balance += d;
        return balance;
    }

    public double withdrawl(double w){  // this will only lets you withdraw money if there is enough
        if (this.balance >= w){
            this.balance -= w;
            return balance;
        } else {
            System.out.println("you don't have enough funds...");
            return balance;
        }

    }

    public String toString() {  // Prints info about the account
        System.out.println("name: "+ this.name + ", accountNumber: " + this.accountNumber + ", balance: " + this.balance);
        return null;
    }
}
