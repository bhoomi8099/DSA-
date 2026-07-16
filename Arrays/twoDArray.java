package Arrays;
import java.util.Arrays;

import java.util.ArrayList;
import java.util.List;

public class twoDArray {
//    static List<Integer> sumOfRows(int[][] arr){
//        List<Integer> result= new ArrayList<>();
//        int row= arr.length;
//        int col=arr[0].length;
//
//        for(int r=0;r<row;r++){
//            int sum=0;
//            for(int c=0;c<col;c++){
//                int value= arr[r][c];
//                sum=sum+value;
//            }
//            result.add(sum);
//        }
//        return result;


    static int[][] transposeMatrix(int[][] matrix){

        //old array
        int oldRow= matrix.length;
        int oldCol= matrix[0].length;
        //new array
        int newRow=oldCol;
        int newCol=oldRow;
        int[][] newArray= new int[newRow][newCol];
        for(int i=0; i<oldRow;i++){
            for(int j=0;j<oldCol;j++){
                newArray[j][i]=matrix[i][j];
            }
        }
        return newArray;
    }

    static void main(String[] args) {
        int[][] arr= {{10,20,30},{40,50,20},{30,35,80}};
        int[][] ans=transposeMatrix(arr);
        System.out.println(Arrays.deepToString(ans));
//        List<Integer> ans=sumOfRows(arr);
//        System.out.println(ans);

    }
}
