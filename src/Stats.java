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
    public static String getTotalDate(){
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
    public static String getTime(){
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
    public static String getDate(){
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

    /**
     * returns a non abbreviated version of the calendar dates because why not.
     * @return Day/String
     * @author Miguel Rosario
     */
    private static String getDays(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("E");
        String day = formatter.format(calendar.getTime());
        switch(day){
            case"Sun":
                return "Sunday";

            case"Mon":
                return "Monday";

            case"Tue":
                return "Tuesday";

            case"Wed":
                return "Wednesday";

            case"Thu":
                return "Thursday";

            case"Fri":
                return "Friday";

            case"Sat":
                return "Saturday";

            default:
                return day;

        }
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