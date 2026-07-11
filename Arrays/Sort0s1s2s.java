package Arrays;

public class Sort0s1s2s {
    static void sort01(int[] arr){ //sort 0s and 1s
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]>arr[right]){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
            if(arr[left]==0){
                left++;
            }
            if (arr[right]==1){
                right--;
            }
        }

    }
    static void sort0s1s2s(int[]arr){
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                mid++;
                low++;
            }
            else if (arr[mid]==1) {
                mid++;
            }

            else if(arr[mid]==2){
                int temp1=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp1;
                high--;
            }

        }

    }
    static void main(String[] args) {
        int[] arr={1,0,2,1,0,2,1,0,2,1,2};
        sort0s1s2s(arr);

        for(int n:arr){
            System.out.print(" "+n+" ");
        }
    }

        }
