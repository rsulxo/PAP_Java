import java.util.ArrayList;


public class Bank {

    private ArrayList<Account> accounts;    // to keep records of accounts

    private double savingsInterestRate;     // stores the rate of interest for SavingsAccount in percentage

    // to initialise account ArrayList with a new one.
    public Bank(){
        accounts = new ArrayList<>();
    }

    // sets the rate in percentage
    public void setSavingsInterest(double rate){
        savingsInterestRate = rate;
    }

    // returns the number of accounts active in the bank.
    public int numberOfAccounts(){
        return accounts.size();
    }

    // adds an account to the accounts ArrayList
    public void addAccount(Account a){
        accounts.add(a);
    }

    // return the first Account object corresponding to given accountID and
    // returns null If the specified account does not exist.
    public Account getAccount(String accountID){
        for(int i = 0; i < accounts.size(); i++){
            if (accounts.get(i).id.equals(accountID)){
                return accounts.get(i);
            }
        } return null;
    }

    // deposit provided amount into the account specified by accountID.
    // If account is not found, then return false. Otherwise make the deposit and return true.
    public boolean deposit(String accountID, double amount){
        for(int i = 0; i < accounts.size(); i++){
            if (accounts.get(i).id.equals(accountID)){
                accounts.get(i).deposit(amount);
                return true;
            }
        } return false;
    }

    // withdraw provided amount from the account specified by accountID.
    // Returns true if successful, false otherwise.
    public boolean withdraw(String accountID, double amount){
        for(int i = 0; i < accounts.size(); i++){
            if (accounts.get(i).id.equals(accountID)){
                accounts.get(i).withdraw(amount);
                return true;
            }
        } return false;
    }

    // withdraw from provided fromAccountID and deposit to specified toAccountID.
    // if the transaction is successful it returns true and otherwise it returns true.
    // The transaction fees corresponding to concrete implementations of withdraw and deposit will apply.
    public boolean transfer(String fromAccountID, String toAccountID, double amount){
        Account from = null;
        Account to = null;
        for(int i = 0; i < accounts.size(); i++){
            if(from != null && to != null) {
                if (accounts.get(i).id.equals(fromAccountID)){
                    from = accounts.get(i);
                } else if(accounts.get(i).id.equals(toAccountID)){
                    to = accounts.get(i);
                }
            }
        }

        if(to != null && from != null){
            withdraw(fromAccountID, amount);
            deposit(toAccountID, amount);
            return true;
        }
        return false;

    }

    // iterate through all accounts and add interest to the eligible accounts (i.e., all SavingsAccounts)
    // using the rate set in the class.
    public void addInterest(){
        for(int i = 0; i < accounts.size(); i++){
            if(accounts.get(i) instanceof SavingsAccount){
                ((SavingsAccount) accounts.get(i)).addInterest(1);
            }
        }
    }

    // iterate through all accounts and reset the number of checks for appli- cable accounts (i.e., all CheckingAccounts)
    public void reset(){
        for(int i = 0; i < accounts.size(); i++){
            if(accounts.get(i) instanceof CheckingAccount){
                ((CheckingAccount) accounts.get(i)).resetChecksUsed();
            }
        }
    }
}