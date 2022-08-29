import java.sql.*;

public class ExistingTasks {
    static final String DB_URL = "jdbc:mysql://localhost:3306/TUTORIALSPOINT";
    static final String USER = "root";
    static final String PASS = "user";

    static final String QUERRY_USE_DB = "use TUTORIALSPOINT;";

    static final String QUERRY_SELECT = "SELECT taskName, dateCreation, dateToExecute, " + "description FROM ExistingTasks";
    static final String UPDATE_ACTION = "CREATE TABLE ExistingTasks (taskName VARCHAR(255) not NULL,  dateCreation VARCHAR(255) not NULL, dateToExecute VARCHAR(255), description VARCHAR(255));";

    private String option;

    TalkToCustomerInterface speech = new TalkToCustomer();


    public ExistingTasks() {
    }

    public int menuWork() {
        try {
            switch (Integer.parseInt(option)) {
                case 1:
                    speech.printExistingTasksMenu();
                    this.CreateExistingTasksTable();
                    return 1;
                case 2:
                    speech.printExistingTasksMenu();
                    return 2;
                default:
                    return 5;
            }
        } catch (NumberFormatException e) {
//            System.out.println("Wrong menu input try again");
//            speech.printExistingTasksMenu();
        }
        return 1;
    }

    private void CreateExistingTasksTable() {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS); Statement stmt = conn.createStatement()) {
            //stmt.executeQuery(QUERRY_USE_DB);
            stmt.executeUpdate(UPDATE_ACTION);
            this.menuWork();
        } catch (SQLException e) {
            e.printStackTrace();
            //System.out.println("something went wrong");
        }
    }
}
