package Day1;

import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = (int)(Math.random()*10);
        int y = (int)(Math.random()*10);

        System.out.printf("What's %d*%d?",x,y);
        int answer =  sc.nextInt();

        while (answer != x*y ){

            System.out.print("tray agin!");
             answer =  sc.nextInt();


           }
        System.out.print("correct");
    }

    }




