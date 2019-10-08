import java.util.ArrayList;
import java.util.LinkedList;

public class Task {

    private String taskName;
    private String taskDescription;
    private String dueDate;
    private Stats Statistics;
    private Task masterTask;
    private ArrayList<Task> subtasks;
    //private LinkedList[Task] subtasks;

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
     * Set the task description.
     * @param taskDescription the task description
     */
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    /**
     * Get the due date.
     * @return the due date
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Set the due date
     * @param dueDate the due date
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
     * Get the master task of this sub task.
     * @return the master task
     */
    public Task getMasterTask() {
        return masterTask;
    }

    /**
     * Set the master task for this sub task.
     * @param masterTask the master task
     */
    public void setMasterTask(Task masterTask) {
        this.masterTask = masterTask;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskName='" + taskName + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", Statistics=" + Statistics +
                ", masterTask=" + masterTask +
                '}';
    }
}