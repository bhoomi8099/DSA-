package Sorting;

import java.util.Arrays;

public class TypesOfSort {
    static void bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    static void selectionSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex= j;
                }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;

            }
        }
    }

    static void insertionSort(int[] arr){
        for (int i=1;i<arr.length;i++){
            int currentCard=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>currentCard){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=currentCard;
        }
    }

    static void main(String[] args) {
        int[] arr={5,3,7,2,1,9};
        //selectionSort(arr);
        //bubbleSort(arr);
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
//        for(int n:arr){
//            System.out.print(n+" ");
//        }
    }
}
