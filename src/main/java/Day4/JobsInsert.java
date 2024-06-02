package Day4;

import java.sql.*;
import java.util.Scanner;

public class JobsInsert {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String url = "jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\JavaBasics\\src\\main\\java\\Day4\\hr.db";
        String query = "insert into jobs values(?,?,?,?)";

        try (Connection conn= DriverManager.getConnection(url);){
            PreparedStatement st = conn.prepareStatement(query);

            System.out.println("Enter job_id: ");
            int jt = sc.nextInt();
            st.setInt(1,jt);
            sc.nextLine();


            System.out.println("Enter job_title :");
            String jt1 = sc.nextLine();
            st.setString(2,jt1);


            System.out.println("Enter min_salary :");
            double jt2 = sc.nextDouble();
            st.setDouble(3,jt2);


            System.out.println("Enter max_salary : ");
            double jt3 = sc.nextDouble();
            st.setDouble(4,jt3);


            int rows = st.executeUpdate();
            System.out.println(rows +", inserted");


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
