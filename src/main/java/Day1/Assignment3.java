package Day1;

import utils.KeyboardUtil;

public class Assignment3 {
    public static void main(String[] args) {
        int from = KeyboardUtil.getInt("Enter a start number: ");
        int to = KeyboardUtil.getInt("Enter a to number: ");
        int sum = sumOfPrimes(from,to);
        System.out.println("Sum of primes between " + from + " " + to + " is " + sum);
    }
    public static int sumOfPrimes(int from, int to) {
        // do stuff here
        int count = 0;
        for(int i = from;i<=to;i++){
            if(Assignment2.isPrimeNumber(i)){
                count += i;
            }
        }
        return count;
    }
}
