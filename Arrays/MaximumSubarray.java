package Arrays;

public class MaximumSubarray {
    static int maxSubarray(int[] nums){
        int sum=0;
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            //STEP1:sum create krna
            sum=sum+nums[i];
            //STEP2:max update krna
            if(sum>max){
                max=sum;
            }
            //STEP3:sum check krna
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }

    static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        int ans=maxSubarray(nums);
        System.out.println(ans);
    }
}
