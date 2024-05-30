package Day2;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pleas entar your mark and full mark");
        double mark = sc.nextDouble();
        double fullmark = sc.nextDouble();

      double yourmark =  method.calculation(mark,fullmark);
       String gread= method.getGread(yourmark);

        System.out.println("ypur mark is :"+yourmark+"and your graed is :"+ gread);

    }
}
