/**
 * This class provides various static methods that calculate various quantities
 * related to dates, including the day of week a date fall on.
 * @author
 * @version
 */
public class Date {
    /**
     * Returns true if the year is a leap year; otherwise false
     * @param year the year
     * @return true if the year is a leap year; otherwise false.
     */
    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    /**
     * Returns the name of the day given by dayValue
     * @param dayValue Numerical value of the day in the range 0 to 6, inclusively
     * @return the name of the day given by dayValue
     */
    public static String getNameOfDay(int dayValue){

        if (dayValue >= 0) {
            dayValue %= 7;
        } else {
            dayValue = dayValue % 7 + 7;
        }


        return switch (dayValue) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> null;
        };
    }

    /**\
     * Returns the numeric value of the month.
     *   1 - January
     *   2 - February
     *   ...
     *   12 - December
     * @param name name of the month
     * @return the numeric value of the month.
     */
    public static int getMonthNumber(String name){
        switch (name.toLowerCase()) {
            case "january":
                return 1;
            case "february":
                return 2;
            case "march":
                return 3;
            case "april":
                return 4;
            case "may":
                return 5;
            case "june":
                return 6;
            case "july":
                return 7;
            case "august":
                return 8;
            case "september":
                return 9;
            case "october":
                return 10;
            case "november":
                return 11;
            case "december":
                return 12;

        };
        return -1;
    }

    /**
     * Returns the name of the month given the numeric value provided by month
     *      1 - January
     *      2 - February
     *      ...
     *      12 - December
     * @param month Numeric value of the month.  Should be 1 to 12, inclusively
     * @return the name of the month given the numeric value provided by month
     */
    public static String getMonthName(int month){
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";

        };
        return null;
    }

    /**
     * Returns the number of days in the month given by the parameter month
     * @param month the numeric value of the month
     * @param year year
     * @return the number of days in the month given by the parameter month
     */
    public static int getDaysInMonth(int month, int year){
        //TODO: replace this line and next with your code.
        if (month >= 1 && month <= 12 && year >= 1 && year <= 12) {


        }
        return -1;
    }

    /**
     * Returns the number of days in the month given by the parameter month
     * @param month the name of the month
     * @param year year
     * @return the number of days in the month
     */
    public static int getDaysInMonth(String month, int year){
        //TODO: replace this line and next with your code.
        return -1;
    }

    /**
     * Returns the offset in days for the month relative to January
     * @param month numeric value of the month
     * @param year year
     * @return the offset in days for the month relative to January
     */
    public static int getMonthOffset(int month, int year){
        //TODO: replace this line and next with your code.
        return -1;
    }

    /**
     * Returns the day of the week that the date falls on
     * @param month numeric value of the month
     * @param dayOfMonth day of the month
     * @param year year
     * @return the day of the week that the date falls on
     */
    public static int dayOfWeek(int month, int dayOfMonth, int year){
        //TODO: replace this line and next with your code.
        return -1;
    }

    /**
     * Returns the day of the week that the date falls on
     * @param month name of the month
     * @param dayOfMonth day of the month
     * @param year year
     * @return the day of the week that the date falls on
     */
    public static int dayOfWeek(String month, int dayOfMonth, int year){
        //TODO: replace this line and next with your code.
        return -1;
    }
}
