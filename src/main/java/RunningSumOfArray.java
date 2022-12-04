import java.util.Arrays;

public class RunningSumOfArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,10};
        runningSum(nums);
    }
    public static int[] runningSum(int[] nums) {
        int i = 1;
        while (nums.length > i){
            nums[i] += nums[i-1];
            i++;
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }
}
