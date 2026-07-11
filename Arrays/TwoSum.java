package Arrays;
import java.util.Arrays;

public class TwoSum {
    //SOL 1
    static int[] twoSum(int[] nums,int target){
        for (int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    int[] ans={i,j};
                    return ans;
                }
            }
        }
        int[] ans={};
        return ans;
    }

    static void main(String[] args) {
        int[] nums={2,11,5,7};
        int target=9;
        int[] result=twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }
}
