package Day2;

import utils.KeyboardUtil;

public class Assignment1 {
    public static void main(String[] args) {
        int n = KeyboardUtil.getInt("Enter size of array!");
        int[] nums = new int[n];
        for(int i = 0;i<n;i++){
            nums[i] = KeyboardUtil.getInt("Enter number:");
        }
        int[] ans = sumOfEvensAndOdds(nums);
        System.out.println(ans[0] + " "+ ans[1]);
    }
    public static int[] sumOfEvensAndOdds(int []nums) {
        // do stuff here
        int even = 0;
        int odd = 0;
        for (int i =0;i< nums.length;i++){
            int num = nums[i];
            if (num%2==0)
                even += num;
            else
                odd += num;
        }
        int[] ans = new int[2];
        ans[0] = even;
        ans[1] = odd;
        return ans;
    }
}
