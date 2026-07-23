package Sorting;

public class BookAllocation {
    static boolean isValid(int[] arr, int k, long mid) {
        int studentCount = 1; // Start with the first student!
        long sum = 0;

        for (int i = 0; i < arr.length; i++) {

            // Can the current student take this book without exceeding 'mid'?
            if (sum + arr[i] <= mid) {
                // BLANK 1: Update the sum for this student
                sum=sum+arr[i];

            } else {
                // No, they cannot. Bring in the next student.
                studentCount++;

                sum=arr[i];
                // BLANK 2: Hand this current book to the new student (update sum)

                if(studentCount>k){
                    return false;
                }
                // BLANK 3: Check if bringing in this new student exceeded our limit 'k'
                // If it did, what should you return?

            }
        }

        // If we make it through the entire loop without failing...
        return true;
    }

    static int findPages(int[] arr, int k) {
        if(arr.length<k){
            return -1;
        }
        // code here
        long n = arr.length;
        long start=0;
        long end=0;
        for(int i=0; i<n; i++){
            start= Math.max(start,arr[i]);
            end= end+arr[i];
        }
        long ans=-1;

        while(start<=end){
            long mid= start+(end-start)/2;

            if(isValid(arr,k, mid)){
                ans= mid;
                //left move
                end=mid-1;
            }

            else{
                //right
                start=mid+1;
            }

        }

        return (int) ans;
    }

    static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int k= 2;
        int result= findPages(arr,k);
        System.out.println(result);

    }
}

