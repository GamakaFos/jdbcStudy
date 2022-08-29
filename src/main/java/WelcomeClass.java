import java.util.Scanner;

public class WelcomeClass {


    private Boolean exit = false;

    TalkToCustomerInterface speech = new TalkToCustomer();
    ExistingTasks existingTasks = new ExistingTasks();
    Scanner sc = new Scanner(System.in);
    public WelcomeClass() {
        speech.printWelcome();
        speech.printMainMenu();
        this.menuWork(sc.nextLine());
    }

    private void menuWork(String option) {
            try {
                switch (Integer.parseInt(option)) {
                    case 1:
                        existingTasks.menuWork();
                        //return 1;
                    //break;
                    case 2:
                        speech.printMainMenu();
                        //return 2;
                    //break;
                    case 3:
                        speech.printMainMenu();
                        //return 3;
                    //break;
                    case 4:
                        speech.printMainMenu();
                        //return 4;
                    default:
                        //return 5;
            }
            } catch (NumberFormatException e){
                System.out.println("Wrong menu input try again");
                speech.printMainMenu();
            }
            //return 1;
    }
}
