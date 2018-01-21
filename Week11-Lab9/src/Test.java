public class Test {

    public static void main(String[] args) {

        Bank bank = new Bank();

        SavingsAccount sav = new SavingsAccount("23", 1000);
        CheckingAccount alish = new CheckingAccount("24",5000);

        System.out.println(alish.getBalance());
        alish.withdrawUsingCheck(10);
        alish.withdrawUsingCheck(10);
        alish.withdrawUsingCheck(10);
        alish.withdrawUsingCheck(10);

        System.out.println(alish.getBalance());

    }

}
