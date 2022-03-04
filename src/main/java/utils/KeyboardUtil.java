package utils;

import java.util.Scanner;

public class KeyboardUtil {
    public static int getInt(String message){
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static long getLong(String message){
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextLong();
    }
    public static double getDouble(String message){
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
    public static String getFloat(String message){
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
}
