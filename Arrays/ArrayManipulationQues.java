package Arrays;

public class ArrayManipulationQues {
    static void reverseArray(int[] arr){
        int left=0;
        int right=arr.length-1;
        int temp;
        while(left<right){
            if (arr[left]==arr[right]){
                System.out.println(arr[left]);
            }
            else{
                temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
    }

    static void shiftArrayElementBy1(int[] arr){
        int temp;
        temp=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=temp;
    }

    static void printExtremeAlt(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            if(left==right){
                System.out.println(arr[left]);
            }
            else{
                System.out.print(" "+arr[left]+" ");
//                left++;
                System.out.print(" "+arr[right]+" ");
            }
            left++;
            right--;
        }
    }

    static void countFrequency(int[] arr){
        
    }
    static void main(String[] args) {
        int[] arr={10, 20, 30, 40, 50,60};
        printExtremeAlt(arr);
        //shiftArrayElementBy1(arr);
        //reverseArray(arr);
//        for(int n:arr){
//            System.out.print(" "+n+" ");
//        }
    }
}
