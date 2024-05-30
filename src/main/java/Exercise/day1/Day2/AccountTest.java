package Exercise.day1.Day2;

public class AccountTest {
    public static void main(String[] args) {
        var x = new  Account("wadha",10000);
        var y= new  Account("Ali",15000);
        x.withdraw(1000);
        System.out.println(x.name);
        System.out.println(x.getManthlyInt());
        System.out.println(x.getBalance());

        System.out.println("--------------------------");
        y.withdraw(1500);
        System.out.println(y.name);
        System.out.println(y.getManthlyInt());
        System.out.println(y.getBalance());
    }
}
