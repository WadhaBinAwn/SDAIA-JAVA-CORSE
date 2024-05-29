package Day2;

import java.time.LocalDate;
import java.util.Date;

public class Emploee {


    String name;
    double salary;
    int date=2024;
    int heairyesr;


     public Emploee(String n, double s, int d){
         name=n;
         salary=s;
         heairyesr = d;
     }


     public double calculationS(){
         return 12*salary;
     }

     public int dateE(){
         return  date-heairyesr;
     }
}
