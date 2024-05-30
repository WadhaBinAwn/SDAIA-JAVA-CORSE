package Day2;

public class Account {


    String name;
    double balance;
    static double AnioalRate = 0.04;

    public Account(String s, double b){
        balance=b;
        name = s;
    }
    public static double getManthlyRate(){
        return AnioalRate/12;
    }

    public double getManthlyInt(){
        double rate = getManthlyRate();
        return balance*rate;
    }

    public void deposit(double amount){
         balance = balance +  amount;
    }

    public void withdraw(double amount){
          balance = balance  - amount;
    }

    public double getBalance(){
        return balance;
    }



}
