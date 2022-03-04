package Day1;

import utils.KeyboardUtil;

public class Assignment5 {
    public static void main(String[] args) {
        long degree = KeyboardUtil.getLong("Enter degree: ");
        int n = KeyboardUtil.getInt("Enter number of times you wnat to iterate sine function: ");
        double ans = sineFuntion(degree,n);
        System.out.println("Sine of " + degree + " degree after "+ n +" iteration is " + ans);
    }

    private static double sineFuntion(long degree, int n) {
        double ans = 0;
        boolean isPositive = true;
        long pow = 1;
        long fact = 1;
        for(int i = 0;i<n;i++){
            long numPow = powerOfInt(degree,pow);
            fact = calcFact(fact,pow);
            //System.out.println(fact);
            pow += 2;
            double term = numPow / fact;
            if(isPositive){
                ans = ans + term;
                isPositive = false;
            }
            else {
                ans = ans - term;
                isPositive = true;
            }
            //System.out.println(i+ " " + ans);
        }
        return ans;
    }

    private static long calcFact(long fact, long pow) {
        if(pow == 1)return fact;
        fact = fact* pow*(pow-1);
        return fact;
    }

    private static long powerOfInt(long num, long pow){
        long product = num;
        if(pow == 1) return num;
        for(int i = 2;i<=pow;i++){
            product *= num;
        }
        return product;
    }
}
