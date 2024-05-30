package Day1;

import java.util.Scanner;

public class TypeOfNumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

     System.out.printf("What's type of number?");
        int answer =  sc.nextInt();
          System.out.printf( answer%2==0?"even":"odd");}
}
