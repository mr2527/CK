import java.util.ArrayList;

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

    /** get the sub tasks belonging to a master task */
    private ArrayList subTasks;

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
     * param: today's date in "##/##/####" form
     * Author: Joseph Saltalamacchia
     * @return the number of days until the due date
     */
    public int daysUntilDue(String today)
    {
        String[] partsDue = dueDate.split("/");
        String[] partsToday = today.split("/");

        return(Integer.parseInt(partsDue[1]) - Integer.parseInt(partsToday[1]));

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


}