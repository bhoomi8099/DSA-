package Arrays;

import java.util.HashMap;
import java.util.HashSet;

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

    static void getHighestLowest(int[] arr){
        HashMap<Integer,Integer> countFreq= new HashMap<>();
        for (int n:arr){
            countFreq.put(n, countFreq.getOrDefault(n,0)+1);
        }
        int MaxFreq= Integer.MIN_VALUE;
        int MaxFreqNum=-1;

        int MinFreq=Integer.MAX_VALUE;
        int MinFreqNum=-1;

        for (int key:countFreq.keySet()){
            if(countFreq.get(key)>MaxFreq){
                MaxFreq=countFreq.get(key);
                MaxFreqNum=key;
            }
            if(countFreq.get(key)<MinFreq){
                MinFreq=countFreq.get(key);
                MinFreqNum=key;
            }
        }
        System.out.println("Highest freq is"+" "+MaxFreq+" "+"of"+" "+MaxFreqNum);
        System.out.println("Lowest freq is"+" "+MinFreq+" "+"of"+" "+MinFreqNum);
    }

    static void shiftBy_K_Element(int[] arr,int k){
        int[] temp= new int[arr.length];
        for (int i=0;i<arr.length;i++){
            int newIndex= (i+k)%(arr.length);   //circular array
            temp[newIndex]=arr[i];
        }
        System.out.println("Shifted array by"+" "+k+" "+"elements");
        for (int n:temp){
            System.out.print(" "+n+" ");
        }
    }

    static void unionOfArrays(int[] arr1,int[] arr2){
        HashSet<Integer> Element=new HashSet<>();
        HashSet<Integer> Element2=new HashSet<>();
        for(int n:arr1){
            Element.add(n);
        }
        for (int p:arr2){
            Element2.add(p);
        }
        Element.addAll(Element2);

        System.out.println(Element);
    }
    static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 1, 6,3,7};
        unionOfArrays(arr1,arr2);

//        int[] arr = {10, 20, 30, 40, 50};
//        int k=3;
//        shiftBy_K_Element(arr,k);
        //getHighestLowest(arr);
        //int ans=modOfArray(arr);
        //System.out.println("Mod is"+" "+ans);
        //printExtremeAlt(arr);
        //shiftArrayElementBy1(arr);
        //reverseArray(arr);
//        for(int n:arr){
//            System.out.print(" "+n+" ");
//        }
    }
}
