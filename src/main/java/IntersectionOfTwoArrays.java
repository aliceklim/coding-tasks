import java.util.Arrays;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = new int[]{4,9,5};
        int[] nums2 = new int[]{9,4,9,8,4};
        intersect(nums1, nums2);

    }
    //find the duplicated part in two arrays
    public static int[] intersect(int[] nums1, int[] nums2) {
        int n[] = new int[1001];
        int result[] = new int[1001];
        int count = 0;
        for (int i : nums1){
            n[i]++;
        }
        for(int i : nums2){
            if (n[i] > 0){
                result[count++] = i;
                n[i]--;
            }
        }
        return Arrays.copyOfRange(result,0,count);
    }
}
