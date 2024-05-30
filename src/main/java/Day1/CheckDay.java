package Day1;

import java.util.Scanner;

public class CheckDay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter of a day:");

        int day =  sc.nextInt();

        if(day>=1 && day<=4 || day==7){
            System.out.println("work-day");
        } else if (day==5 || day==6) {
            System.out.println("off-day");
        }else {
            System.out.println("Invalid");
        }
//switch (day){
//    case 1 -> {
//        System.out.println("work-day");
//    }case 2-> {
//        System.out.println("work-day");
//    }case 3 -> {
//        System.out.println("work-day");
//    }case 4 -> {
//        System.out.println("work-day");
//    }case 7 -> {
//        System.out.println("work-day");
//    }case 5 -> {
//        System.out.println("off-day");
//    }case 6 -> {
//        System.out.println("off-day");
//
//    }
//
//}

    }
}
