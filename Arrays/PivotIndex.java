package Arrays;

public class PivotIndex {
    static int findPivotIndex(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        leftSum[0] = nums[0];
        int[] rightSum = new int[n];
        rightSum[n - 1] = nums[n - 1];
        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i];
        }
        for (int i = n - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + nums[i];
        }
        for (int i = 0; i < n; i++) {
            if (rightSum[i] == leftSum[i]) {
                return i;
            }
        }
    return -1;
    }
    static void main(String[] args) {
        int[] nums={1,7,3,6,5,6};
        int ans=findPivotIndex(nums);
        System.out.println(ans);
    }
}
