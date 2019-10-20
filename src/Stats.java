import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
* SimpleDateFormat link for later: https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
* Calendar link for later: https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html
 */
public class Stats {

    private String dateAssigned;
    private String dateCompleted;
    private double estimateTime;
    private double actualTime;
    private boolean isActive;

    /**
     * a Stats object that has 5 variables instantiated.
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
     * Returns the estimated time the user inputs.
     * @return estimateTime
     * @author Miguel Rosario
     */
    public double getEstimateTime() {
        return estimateTime;
    }

    /**
     * Returns the estimated time set by the user to finish the task.
     * @param estimateTime Time set by the user.
     * @author Miguel Rosario
     */
    public void setEstimateTime(double estimateTime) {
        this.estimateTime = estimateTime;
    }

    /**
     * Returns a value of the real time (computer) subtracted by the total time estimated time
     * @return
     */
    public double getActualTime() {
        return actualTime;
    }

    /**
     * Actual time is the ending time after the alarm has finished minus the estimated time.
     * @param actualTime
     * @author Miguel Rosario
     * @author editor(s)
     */
    public void setActualTime(double actualTime) {
        //Working on method later
        this.actualTime = actualTime;
    }

    /**
     * If the timer is active return a true or false.
     * @return isActive True/False
     * @author Miguel Rosario
     */
    public boolean isActive() {
        return isActive;
    }

    /**
     *
     * @param active
     */
    //I have no idea what this is used for
    public void setActive(boolean active) {
        isActive = active;
    }

    /**
     * Returns date/time in MM DD YYYY, HH MM SS format
     * @return String that contains the date and time.
     * @author Miguel Rosario
     */
    private static String getTotalDate(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("E: MM/dd/yyyy \nHH:mm:ss a z");
        String totalDateString = formatter.format(calendar.getTime());
        return totalDateString;
    }

    /**
     * Helper function that solely returns the time in HH MM SS format.
     * @return timeString
     * @author Miguel Rosario
     */
    private static String getTime(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        String timeString = formatter.format(calendar.getTime());
        return timeString;
    }

    /**
     * Helper function that solely returns the date in MM DD YYYY format.
     * @return dateString
     * @author Miguel Rosario
     */
    private static String getDate(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String dateString = formatter.format(calendar.getTime());
        return dateString;
    }

    /**
     * Helper function that solely returns the timezone of the user.
     * @return timeZone
     * @author Miguel Rosario
     */
    private static String getTimeZone(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("z");
        String timeZone = formatter.format(calendar.getTime());
        return timeZone;
    }

    private static String getDays(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("E");
        String day = formatter.format(calendar.getTime());
        switch(day){
            case"Sun":
                return "Sunday";

            case"Mon":
                return "Monday";

            case"Tues":
                return "Sunday";

            case"Wed":
                return "Monday";

            case"Thur":
                return "Sunday";

            case"Fri":
                return "Monday";

            case"Sat":
                return "Saturday";


        }
        return "no";
    }

    /**
     * Override toString method that displays the stats
     * @author Miguel Rosario
     */
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
        String totalDate = getTotalDate();
        String time = getTime();
        String date = getDate();
        String timeZone = getTimeZone();
        System.out.println(date + "\n" + time + "\n" + totalDate + "\n" + timeZone);
        String day = getDays();
        System.out.println(day);

    }
}