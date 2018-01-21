public abstract class Account {

    protected String id;    // stores account ID
    protected double balance; // stores the account balance

    public Account(String id, double balance){      // initialise attributes
        this.id = id;
        this.balance = balance; // assign it to instance variable balance
        }


    public String getID(){          // returns the account id
        return id;
    }

    public double getBalance(){     // returns the account balance
        return balance;
    }

    @Override
    public String toString() {  // returns string that contains the id & balance
        return super.toString() + "Account ID: "+ this.id + "Balance: "+ this.balance;
    }

    public abstract boolean withdraw(double amount);    // abstract method to be implemented by sub-classes

    public abstract void deposit(double amount);        // abstract method to be implemented by sub-classes

    public static void main(String[] args){

    }
}