package Day2;

import utils.KeyboardUtil;

public class Assignment2 {
    public static void main(String[] args) {
        String sentence = KeyboardUtil.getString("Enter a sentence to be reversed!");
        String out = reverseByWords(sentence);
        System.out.println(out);
    }
    public static String reverseByWords(String sentence) {
        // do stuff here
        StringBuilder ans = new StringBuilder();
        String[] str = sentence.split(" ");
        System.out.println(str.length);

        for(int i = str.length-1;i>=0;i--){
            ans.append(str[i] + " ");
            System.out.println(i);
        }
        return ans.toString();
    }
}
