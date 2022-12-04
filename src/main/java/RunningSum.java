import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        runningSum(nums);
    }

    public static int[] runningSum(int[] nums) {
        int i = 1;
        while (i<nums.length){
            nums[i]+=nums[i-1];
            i++;
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }
}
