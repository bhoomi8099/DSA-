package Arrays;

import java.util.HashMap;

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

    static int modOfArray(int[] arr){
        HashMap<Integer,Integer> freq= new HashMap<>();
        for(int n:arr){
            freq.put(n,freq.getOrDefault(n,0)+1);
        }
        int maxFreq=-1;
        int mod=-1;
        for (int key: freq.keySet()){
            if (freq.get(key)>maxFreq){
                maxFreq=freq.get(key);
                mod=key;
            }
        }
        return mod;
    }
    static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5};
        int ans=modOfArray(arr);
        System.out.println("Mod is"+" "+ans);
        //printExtremeAlt(arr);
        //shiftArrayElementBy1(arr);
        //reverseArray(arr);
//        for(int n:arr){
//            System.out.print(" "+n+" ");
//        }
    }
}
