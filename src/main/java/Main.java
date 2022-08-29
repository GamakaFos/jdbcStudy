
    import java.sql.*;
    import java.util.Scanner;

    public class Main {
        static final String DB_URL = "jdbc:mysql://localhost/TUTORIALSPOINT";
        static final String USER = "root";
        static final String PASS = "user";
        static final String QUERY = "SELECT id, first, last, age FROM Employees";

        public static void main(String[] args) {

            WelcomeClass mainClass = new WelcomeClass();

//            try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)){
//
//            } catch (SQLException e){
//                e.printStackTrace();
//            }

        }
    }

