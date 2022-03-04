package Day1;

import utils.KeyboardUtil;


public class Assignment1 {
    public static void main(String[] args) {
        int year = KeyboardUtil.getInt("Enter year: ");
        int month = KeyboardUtil.getInt("Enter Month: ");
        int day = KeyboardUtil.getInt("Enter day: ");
        if(isValidDate(year,month,day)){
            System.out.println("It is a valid date!");
        }
        else
            System.out.println("It is not a valid date!");
    }
    static boolean isValidDate(int year, int month, int day) {
        // do stuff here
        if(month>12 || month < 1) return false;
        else if(day<1 || day>31) return false;
        else if(day>=28){
            if(month == 2){
                if(year%400==0 || (year%4==0 && year%100!=0)){
                    if (day <= 29) return true;
                    else return false;
                }
                else {
                    if(day == 28) return true;
                    else return false;
                }
            }
        }
        return true;
    }
}
