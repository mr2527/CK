/**
 * Creating a sub task that belongs to a master task
 * @author Su Thit Thazin
 */
public class subTask extends Task{

    /** the master task that this sub task belongs to */
    public Task masterTask;

    /**
     * Create a sub task.
     * @param taskName the name of the task
     * @param taskDescription the description of the task
     * @param dueDate the date the task is due
     * @param masterTask the master task that this sub task belongs to
     */
    public subTask(String taskName, String taskDescription, String dueDate, Task masterTask) {
        super(taskName, taskDescription, dueDate);
        this.masterTask = masterTask;
    }

    /**
     * Create a sub task
     * @param masterTask the master task that this sub task belongs to
     * @param subTask the sub task
     */
    public subTask(Task masterTask, Task subTask) {
        super(subTask.getTaskName(), subTask.getTaskDescription(), subTask.getDueDate());
        this.masterTask = masterTask;
    }
}
