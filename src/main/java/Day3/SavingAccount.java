package Day3;

public class SavingAccount extends Account{

    int limit = 5000;


    public SavingAccount(String s, double b) {
        super(s, b);
    }
    @Override
    public void withdraw(double amount){
        if(getBalance() - amount >= limit){
            super.withdraw(amount);
        }

    }
}
