package Arrays;

public class basicQues {
    //average of array elements
    static void main(String[] args) {
        int[] arr = {10, 20, 30, 25, 40, 50};
//        int count=arr.length;
//        int sum=0;
//        for (int i= 0; i<arr.length ; i++){
//            sum=sum+arr[i];
//        }
//        double avg=(double) sum/count;
//        System.out.println(avg);
        ;
        //multiply each element by 10
//        for (int n:arr){
//            int a = n*10;
//            System.out.println(a);
//        }
//        boolean isFound= false;
//        for (int i=0;i<arr.length;i++) {
//            if (arr[i] == target) {
//                System.out.println("Element" + " " + arr[i] + " " + "found at" + " " + i + " " + "position");
//                isFound = true;
//                break;
//            }
//        }
//        if (isFound==false){
//                System.out.println("-1");
//            }
//        int sumOfPositive= 0;
//        int sumOfNegative=0;
//        for (int n:arr){
//            if(n>0){
//                sumOfPositive+=n;
//            }
//            else if (n<0) {
//                sumOfNegative+=n;
//            }
//
//            }
//        System.out.println(sumOfPositive);
//        System.out.println(sumOfNegative);

//        int noOfOne=0;
//        int noOfZero=0;
//        for (int n:arr){
//            if (n==1){
//                noOfOne+=1;
//            }
//            if (n==0){
//                noOfZero+=1;
//            }
//        }
//        System.out.println(noOfOne);
//        System.out.println(noOfZero);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("First unsorted element is"+ " "+ arr[i+1]+ " "+ "at"+ " "+(i+1));
                break;
            }
        }
        }
    }

