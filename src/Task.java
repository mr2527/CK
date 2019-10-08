import java.util.ArrayList;

public class Task {

    private String taskName;
    private String taskDescription;
    private String dueDate;
    private Stats Statistics;
    private Task masterTask;
    private ArrayList subTasks;

    /**
     *
     * @param taskName
     * @param taskDescription
     * @param dueDate
     */
    public Task(String taskName, String taskDescription, String dueDate) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.dueDate = dueDate;
    }

    /**
     *
     * @param taskName
     * @param taskDescription
     * @param dueDate
     * @param masterTask
     */
    public Task(String taskName, String taskDescription, String dueDate, Task masterTask) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.dueDate = dueDate;
        this.masterTask = masterTask;
    }

    /**
     *
     * @return
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     *
     * @param taskName
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    /**
     *
     * @return
     */
    public String getTaskDescription() {
        return taskDescription;
    }

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

}