package Day1;

import utils.KeyboardUtil;

public class Assignment6 {
    public static void main(String[] args) {
        int month = KeyboardUtil.getInt("Enter a month: ");
        int year = KeyboardUtil.getInt("Enter a year: ");
        printCalendar(month,year);
    }
    public static void printCalendar(int month, int year) {
        /// do stuff here
        if(isValidMonth(month)) {
            System.out.println("Month not valid!");
            return;
        }
        System.out.println("Hello");

    }
    static boolean isValidMonth(int month) {
        if(month>12 || month < 1) return false;
        return true;
    }
}
