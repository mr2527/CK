import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 */
public class Stats {

    private String dateAssigned;
    private String dateCompleted;
    private double estimateTime;
    private double actualTime;
    private boolean isActive;

    /**
     *
     * @param dateAssigned
     * @param dateCompleted
     * @param estimateTime
     * @param actualTime
     * @param isActive
     * @author Miguel Rosario
     */
    public Stats(String dateAssigned, String dateCompleted, double estimateTime, double actualTime, boolean isActive) {
        this.dateAssigned = dateAssigned;
        this.dateCompleted = dateCompleted;
        this.estimateTime = estimateTime;
        this.actualTime = actualTime;
        this.isActive = isActive;
    }


    /**
     *
     * @return
     */
    public String getDateAssigned() {
        return dateAssigned;
    }

    /**
     *
     * @param dateAssigned
     */
    public void setDateAssigned(String dateAssigned) {
        this.dateAssigned = dateAssigned;
    }

    /**
     *
     * @return
     */
    public String getDateCompleted() {
        return dateCompleted;
    }

    /**
     *
     * @param dateCompleted
     */
    public void setDateCompleted(String dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    /**
     *
     * @return
     */
    public double getEstimateTime() {
        return estimateTime;
    }

    /**
     *
     * @param estimateTime
     */
    public void setEstimateTime(double estimateTime) {
        this.estimateTime = estimateTime;
    }

    /**
     *
     * @return
     */
    public double getActualTime() {
        return actualTime;
    }

    /**
     *
     * @param actualTime
     */
    public void setActualTime(double actualTime) {
        this.actualTime = actualTime;
    }

    /**
     *
     * @return
     */
    public boolean isActive() {
        return isActive;
    }

    /**
     *
     * @param active
     */
    public void setActive(boolean active) {
        isActive = active;
    }

    /**
     * Returns date/time in MM DD YYYY, HH MM SS format
     * @return String that contains the date and time.
     * @author Miguel Rosario
     */
    public static String getDate(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        String dateString = formatter.format(calendar.getTime());
        return dateString;
    }

    @Override
    public String toString() {
        return "Stats{" +
                "dateAssigned='" + dateAssigned + '\'' +
                ", dateCompleted='" + dateCompleted + '\'' +
                ", estimateTime=" + estimateTime +
                ", actualTime=" + actualTime +
                ", isActive=" + isActive +
                '}';
    }

    /**
     * Test cases
     * @param args
     * @author Miguel Rosario
     */
    public static void main(String[] args) {
        String date = getDate();
        System.out.println(date);

    }
}