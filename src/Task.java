import java.util.ArrayList;
import java.util.Objects;

/**
 * Contains functions for generating a task and modifying the properties of a task.
 * @author Joey
 * @author Su Thit Thazin
 */
public class Task {

    /** name of the task */
    private String taskName;

    /** description of the task */
    private String taskDescription;

    /** the due date of the task */
    private String dueDate;

    /** the Statistics of the task */
    private Stats Statistics;

    /** the master task that this task belongs to, if this is not the master task */
    private Task masterTask;

    /** the total time spent on this task */
    private float totalTime;

    /** the total number of days spent on this task */
    private int totalDays;

    /** get the sub tasks belonging to a master task */
    private ArrayList<Task> subTasks;

    /**
     * Make a task.
     * @param taskName name of the task
     * @param taskDescription description of the task
     * @param dueDate due date of the task
     */
    public Task(String taskName, String taskDescription, String dueDate) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.dueDate = dueDate;
        this.totalDays = 0;
        this.totalTime = 0;
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
     * returns the number of days until the task is due
     * Prerequ The string must be in MM/DD/YYYY format
     * @param today's date in "MM/DD/YYYY" form
     * @return the number of days until the due date
     *  Author: Joseph Saltalamacchia
     */
    public int daysUntilDue(String today)
    {
        String[] partsDue = dueDate.split("/");
        String[] partsToday = today.split("/");

        return(Integer.parseInt(partsDue[1]) - Integer.parseInt(partsToday[1]));
    }

    /** Get the total time spent on this task
     * @return the total time spent on this task
     */
    public float getTotalTime() {
        return totalTime;
    }

    /** Set the total time spent on this task
     * @param totalTime the total time spent on this task
     */
    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    /**
     * Get the total number of days spent on this task
     * @return Get the total number of days spent on this task
     */
    public int getTotalDays() {
        return totalDays;
    }

    /**
     * Set the total number of days spent on this task
     * @param totalDays the total number of days spent on this task
     */
    public void setTotalDays(int totalDays) {
        this.totalDays = totalDays;
    }

    /**
     * Add days to the totalDays of this task
     * @param days number of days to be added
     */
    public void AddDays(int days)
    {
        this.totalDays += days;
    }

    /** Add time to the totalTime of this task
     * @param time amount of time to be added
     */
    public void addTime(float time)
    {
        this.totalTime += time;
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
     * Set the description of the task.
     * @param taskDescription the description of the task
     */
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    /**
     * Get the due date of the task.
     * @return the due date of the task
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Set the due date of the task.
     * @param dueDate the due date of the task
     */
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * Get the Stats (date assigned, date completed, estimated time, actual time, and if the task is active)
     * associated with a task.
     * @return the Stats associated with a task
     */
    public Stats getStatistics() {
        return Statistics;
    }

    /**
     * Get the Stats (date assigned, date completed, estimated time, actual time, and if the task is active)
     * associated with a task.
     * @param statistics the Stats associated with a task
     */
    public void setStatistics(Stats statistics) {
        Statistics = statistics;
    }

    /**
     * Get the master task that this sub task belongs to.
     * @return the master task that this sub task belongs to
     */
    public Task getMasterTask() {
        return masterTask;
    }

    /**
     * Set the master task that this sub task belongs to.
     * @param masterTask the master task that this sub task belongs to
     */
    public void setMasterTask(Task masterTask) {
        this.masterTask = masterTask;
    }

    /**
     * Get a sub task.
     * @param name the name of the task
     * @return the sub task that we are looking for
     * @author Su Thit Thazin
     */
    public Task getSubTask (String name) {
        for (Object t : this.subTasks) {
            Task task = (Task) t;
            if (task.taskName.equals(name)) {
                return task;
            }
        }
        return null;
    }

    /**
     * compares Tasks based on the task name, the description of that task, and it's due date
     *
     * @param o the object being compared
     */ @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;
        Task task = (Task) o;
        return taskName.equals(task.taskName) &&
                taskDescription.equals(task.taskDescription) &&
                dueDate.equals(task.dueDate);
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(taskName, taskDescription, dueDate);
    }


}