package Day1;

import utils.KeyboardUtil;

public class Assignment2 {
    public static void main(String[] args) {
        int num = KeyboardUtil.getInt("Enter a number: ");
        if(isPrimeNumber(num)){
            System.out.println(num+ " is prime number!");
        }
        else {
            System.out.println(num+" is not a prime number!");
        }
    }
    static boolean isPrimeNumber(int num) {
        // do stuff here
        if(num == 2) return true;
        for(int i = 2;i<=num/2;i++){
            if(num%2==0) return false;
        }
        return true;
    }
}
