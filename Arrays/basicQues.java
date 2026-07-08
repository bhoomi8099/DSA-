package Arrays;

public class basicQues {
    //Swap Alternate element in an array
    static void swapAlernate(int[] arr){
        int temp;
        for (int i=0;i<arr.length-1;i+=2){
            temp= arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }

    static void intersectionOfArrays(int[] arr1, int[]  arr2){
        int count=0;
        for (int i=0;i< arr1.length;i++){
            for (int j=0;j< arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr2[j]);
                    arr2[j]=-1;  //replace that element with -1,so that it donot match with anyoneelse
                    count++;
                    break;
                }
            }
        }
        System.out.println("Match count"+" "+ count);
    }

    static void printExtremes(int[] arr){
        int left=0;
        int right=arr.length-1;
        // Jab tak left ungli right ungli ko cross nahi karti...
        while (left <= right) {

            // Agar dono ungliyan ek hi dabbe par aa gayi hain (Odd array case)
            if (left == right) {
                System.out.print(arr[left] + " ");
            }
            // Normal case: Dono alag-alag dabbon par hain
            else {
                System.out.print(arr[left] + " ");
                System.out.print(arr[right] + " ");
            }

            left++;   // Left ungli aage badhegi
            right--;  // Right ungli peeche aayegi (Yeh galti thi!)
        }
    }
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        printExtremes(arr);

        //intersectionOfArrays(arr1,arr2);;






//        int[] arr = {10, 20, 30, 25, 40, 50};
//        swapAlernate(arr);
//         for (int n: arr){
//             System.out.print(" "+n);
         //OR System.out.println(Arrays.toString(arr));


        //average of array elements
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
//        for(int i=0;i<arr.length-1;i++){
//            if(arr[i]>arr[i+1]){
//                System.out.println("First unsorted element is"+ " "+ arr[i+1]+ " "+ "at"+ " "+(i+1));
//                break;
//            }
//        }



        }
    }

