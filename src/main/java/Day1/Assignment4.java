package Day1;

import utils.KeyboardUtil;

public class Assignment4 {
    public static void main(String[] args) {
        int num = KeyboardUtil.getInt("Enter a number: ");
        printPattern(num);
    }
    static void printPattern(int num){
        for(int i = 0;i<num;i++){
            for(int j = 0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
