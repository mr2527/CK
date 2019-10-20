import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Task {

    private String taskName;
    private String taskDescription;
    private String dueDate;
    private Stats Statistics;
    private Task masterTask;
    private ArrayList subTasks;

    /**
     *
     * @param taskName name of the task
     * @param taskDescription description of the task
     * @param dueDate due date of the task
     */
    public Task(String taskName, String taskDescription, String dueDate) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.dueDate = dueDate;
    }

    /**
     * Creates a sub task
     * @param taskName name of the task
     * @param taskDescription description of the task
     * @param dueDate due date of the task
     * @param masterTask the master task that this sub task belongs to
     */
    public Task(String taskName, String taskDescription, String dueDate, Task masterTask) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.dueDate = dueDate;
        this.masterTask = masterTask;
    }

    /**
     * Get the name of the task
     * @return the task name
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * Set the name of the task
     * @param taskName the task name
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

//    /**
//     * Get the description of the task
//     * @return
//     */
//    public String getTaskDescription() {
//        return taskDescription;
//    }

    /**
     *
     * @param taskDescription
     */
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    /**
     *
     * @return
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     *
     * @param dueDate
     */
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    /**
     *
     * @return
     */
    public Stats getStatistics() {
        return Statistics;
    }

    /**
     *
     * @param statistics
     */
    public void setStatistics(Stats statistics) {
        Statistics = statistics;
    }

    /**
     *
     * @return
     */
    public Task getMasterTask() {
        return masterTask;
    }

    /**
     *
     * @param masterTask
     */
    public void setMasterTask(Task masterTask) {
        this.masterTask = masterTask;
    }

    /**
     * Gets the date in MM-DD-YYYY format and displays it as a string
     */
    public static void getDate(){
        Calendar calendar = Calendar.getInstance(); // gets current instance of the calendar
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        String dateString = formatter.format(calendar.getTime());
        System.out.println(dateString);
    }

    public boolean finishedInTime(){
        this.dueDate = dueDate;
        return true;
    }

    public static void main(String[] args) {
        getDate();
    }
}