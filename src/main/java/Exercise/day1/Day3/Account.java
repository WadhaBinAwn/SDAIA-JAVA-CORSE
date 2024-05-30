package Exercise.day1.Day3;

public class Account {


    String name;
    double balance;
    static double AnnualRate = 0.04;

    public Account(String s, double b){
        balance=b;
        name = s;
    }
    public static double getManthlyRate(){
        return AnnualRate/12;
    }

    public double getManthlyInt(){
        double rate = getManthlyRate();
        return balance*rate;
    }

    public void deposit(double amount){
         balance = balance +  amount;
    }

    public void withdraw(double amount){
          balance -=  amount;
    }

    public double getBalance(){
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
