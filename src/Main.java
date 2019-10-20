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
    private void helpMessage() {
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
    public void mainLoop(Scanner in, boolean stdin) {
        if (stdin) {
            System.out.println("Type 'help' for the list of commands.");
        }
        System.out.print("> ");
        // continue looping until there is no more input
        label:
        while (in.hasNext()) {
            // read the next command and then call the appropriate method to process it
            String line = in.nextLine();
            if (!stdin) {
                System.out.println(line);
            }
            String[] fields;
            fields = line.split("\\s+");

            /*
            THIS IS JUST THE SKELETON CODE FOR NOW AND DOESNT ACTUALLY DO ANYTHING
             */
            switch (fields[0]) {
                case HELP:
                    helpMessage();
                    break;

                case TASK:
                    break;

                case TASKS:
                    break;

                case DATE:
                    break;

                case TIME:
                    break;

                case EST_TIME:
                    break;

                case DESCRIPTION:
                    break;

                case DESCRIPTIONS:
                    break;

                case SUPER_SECRET_CRAZY_BUTTON:
                    // work in progress maybe
                    System.out.println("Wowie you found me");
                    break;

                case QUIT:
                    break label;

                default:
                    break;
            }

        }
    }


    /**
     * The main method.
     *
     * @param args command line arguments (used - see class description)
     * @throws FileNotFoundException if a file is not found
     */
    public static void main(String[] args) throws FileNotFoundException{
        System.out.println("Hello World");
    }
}
