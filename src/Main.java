import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,4};
        Arrays.sort(nums);
        int[] ans = new int[2];
        for(int i = 0; i < nums.length-1; i++) {
            ans[0] = i;
            int index = Arrays.binarySearch(nums,i+1,nums.length,6-nums[i]);
            if(index > 0 && index != nums.length) {
                ans[1] = index;
                break;
            }
        }
        System.out.println(ans[0]+"  "+ans[1]);
    }
}
