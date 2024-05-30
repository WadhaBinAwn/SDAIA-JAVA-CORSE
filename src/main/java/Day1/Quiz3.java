package Day1;

import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter your phone number?");
       String phone = sc.nextLine();

       if (phone.length()<10){
           System.out.print("invali number");


       }

        else


        {
            if(phone.startsWith("05")){
                int count = 0;
           for(int i=0;i<phone.length(); i++){

               char c = phone.charAt(i);
               if (Character.isDigit(c)) {

                   count++;


              }


           }
                if (count==10){
                    System.out.print("valid number");}
                else {
                    System.out.print("invalid number");
                }
       }}}}




