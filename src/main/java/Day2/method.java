package Day2;

public class method {



    public static double calculation(double mark,double fullmark){

        return (mark/fullmark)*100;


    }


    public static String getGread(double total){

        if(total >85)  return"Excelleant";
        else if (total>75) return "Very Good";
        else if (total>65) return "Good";
        else if (total>=50)return "Pass";
        else return "Fail";

        }


    }

