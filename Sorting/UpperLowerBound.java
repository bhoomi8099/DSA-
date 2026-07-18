package Sorting;

public class UpperLowerBound {
    static int getLowerBound(int[] arr,int target){
        int n=arr.length;
        int start=0;
        int end=n-1;
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>=target){
                //ans store
                ans=mid;
                //move to left
                end=mid-1;
            }
            else{
                //move to right
                start=mid+1;
            }
        }
        return ans;
    }

    static void main(String[] args) {
        int[] arr={10,20,30,30,30,30,30,40,50};
        int target=35;
        int result=getLowerBound(arr,target);
        System.out.println(result);
    }
}
