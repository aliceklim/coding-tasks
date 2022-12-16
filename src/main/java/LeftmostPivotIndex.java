public class LeftmostPivotIndex {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 7, 3, 6, 5, 6};
        pivotIndex(nums);
    }

    public static int pivotIndex(int[] nums) {
        int rightSum = 0;
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++){
            rightSum += nums[i];
        }
        for (int i = 0; i < nums.length; i++){
            rightSum -= nums[i];
            if (rightSum == leftSum){
                System.out.println(i);
                return i;
            }
            leftSum += nums[i];
        }
        System.out.println("-1");
        return - 1;

    }
}
