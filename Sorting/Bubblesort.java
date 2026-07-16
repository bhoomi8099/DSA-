package Sorting;

public class Bubblesort {
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

    static void main(String[] args) {
        int[] arr={5,3,7,2,1,9};
        selectionSort(arr);
        //bubbleSort(arr);
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}
