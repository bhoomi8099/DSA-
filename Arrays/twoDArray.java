package Arrays;

import java.util.ArrayList;
import java.util.List;

public class twoDArray {
    static List<Integer> sumOfRows(int[][] arr){
        List<Integer> result= new ArrayList<>();
        int row= arr.length;
        int col=arr[0].length;

        for(int r=0;r<row;r++){
            int sum=0;
            for(int c=0;c<col;c++){
                int value= arr[r][c];
                sum=sum+value;
            }
            result.add(sum);
        }
        return result;
    }

    static void main(String[] args) {
        int[][] arr= {{10,20,30},{40,50,20},{30,35,80}};
        List<Integer> ans=sumOfRows(arr);
        System.out.println(ans);

    }
}
