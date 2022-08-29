

public class TalkToCustomer implements TalkToCustomerInterface{

    private final String welcomeString = new String("\tHello!");
    private final String MMCheckExistingTasks = new String("\n1. Check existing tasks;");
    private final String MMCheckExecutedTasks = new String("\n2. Check executed tasks;");
    private final String MMCheckDeletedTasks = new String("\n3. Check deleted tasks;");
    private final String MMExit = new String("\n4. Exit.");



    private final String ETNewTask = new String("\n1. New task;");
    private final String ETList = new String("\n2. Existing tasks list;");
    public void printWelcome(){
        System.out.println(welcomeString);
    }
    public void printMainMenu(){
        System.out.println(MMCheckExistingTasks + MMCheckExecutedTasks + MMCheckDeletedTasks + MMExit);
    }

    public void printExistingTasksMenu(){
        System.out.println(ETNewTask + ETList);
    }


}
