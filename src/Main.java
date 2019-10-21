import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Scanner;

/**
 * Main testing class
 * @author Miguel Rosario +
 */
public class Main {
    /** the course command */
    public final static String TASK = "task"; //name description duedate

    public final static String TASKS = "tasks"; //prints all of the tasks

    public final static String DATE = "date"; //pulls the date

    public final static String TIME = "time"; //pulls the time

    public final static String EST_TIME = "est_time"; //sets the estimated time

    public final static String DESCRIPTION = "description"; //pulls the description of the task

    public final static String DESCRIPTIONS = "descriptions"; //pulls all of the descriptions for every task

    public final static String SUPER_SECRET_CRAZY_BUTTON = "SE > CS"; // Who knows what it does?

    public final static String HELP = "help";

    public final static String QUIT = "quit"; //quits

    /**
     * A helper method for displaying the help message.
     * @author Miguel Rosario
     */
    private static void helpMessage() {
        System.out.println("help: This message.");
        System.out.println("task: Print out what the current task is.");
        System.out.println("tasks: List all Tasks (ordered by course date/time).");
        System.out.println("date: Prints tha date in MM/DD/YYYY format.");
        System.out.println("time: Prints the time in HH:MM:SS format.");
        System.out.println("est_Time: Sets the estimated time that a task will take.");
        System.out.println("description: Get's the description of a certain task.");
        System.out.println("descriptions: Gets every description for every task ");
        System.out.println("quit: quit the program.");
    }

    /**
     * Processes all of the commands
     * @author Miguel Rosario
     */
     /*
     THIS IS JUST THE SKELETON CODE FOR NOW AND DOESNT ACTUALLY DO ANYTHING
      */
    private static void mainLoop(String in) {

             /*
             THIS IS JUST THE SKELETON CODE FOR NOW AND DOESNT ACTUALLY DO ANYTHING
              */
            switch (in) {
                case HELP:
                    helpMessage();
                    break;

                case TASK:
                    //get the first task in the list
                    System.out.println("Got to TASK");
                    break;

                case TASKS:
                    //get every task
                    System.out.println("Got to TASKS");
                    break;

                case DATE:
                    System.out.println("The current date is:");
                    System.out.println(Stats.getDays() + " " + Stats.getDate());
                    break;

                case TIME:
                    System.out.println("The current time is:");
                    System.out.println(Stats.getTime() + " " + Stats.getTimeZone());
                    break;

                case EST_TIME:
                    //Get the set estimated time and subtract from the total time taken
                    System.out.println("Got to EST_TIME");
                    break;

                case DESCRIPTION:
                    //Get the description of the first task
                    System.out.println("Got to DESCRIPTION");
                    break;

                case DESCRIPTIONS:
                    //Get the description of every task
                    System.out.println("Got to DESCRIPTIONS");
                    break;

                case SUPER_SECRET_CRAZY_BUTTON:
                    // work in progress maybe
                    System.out.println("Wowie you found me");
                    break;

                case QUIT:
                    System.out.println("Got to QUIT");
                    break;

                default:
                    break;
            }

        }


    /**
     * The main method.
     *
     * @param args command line arguments (used - see class description)
     * @throws FileNotFoundException if a file is not found
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // enter the main loop
        helpMessage();
        System.out.println("Prompting user input\n" +
                "Please input your command:");
        String in = scan.nextLine();

        while(!in.equals("quit")) {

            if(in.matches(".*\\d.*")) {
                System.out.println("The command cannot have a number, try again.\n" +
                        "Input your command:");
                in = scan.nextLine();
            }

            else{
                System.out.println(in);
                mainLoop(in);
                System.out.println("Please input your next command!");
                in = scan.nextLine();
            }

        }

    }

}