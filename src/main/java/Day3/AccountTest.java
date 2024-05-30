package Day3;

public class AccountTest {
    public static void main(String[] args) {
        var x = new SavingAccount("wadha",10000);
        var y= new CheckMyAccount("Ali",15000);

        System.out.println(x.getName()+","+x.getBalance());
        x.withdraw(7000);
        System.out.println(x.getBalance());
        System.out.println("--------------------------------");
        System.out.println(y.getName()+","+y.getBalance());
        y.withdraw(100);
        System.out.println(y.getBalance());


    }
}
