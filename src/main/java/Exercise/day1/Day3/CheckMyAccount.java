package Exercise.day1.Day3;

public class CheckMyAccount extends Account{



    public CheckMyAccount(String s, double b) {
        super(s, b);


    }
        @Override
        public void withdraw(double amount){
            if(getBalance() - amount >= 0){
                super.withdraw(amount);
            }
        }

}
