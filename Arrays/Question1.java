package Arrays;
import java.util.*;

public class Question1 {
public static void main(String[] args) {


        String[] logs = {
                "UP76-AB", "DL01-XY", "UP76-AB", "HR26-ZZ",
                "DL01-XY", "UP76-AB", "MH12-PQ"
        };
        Map<String, Integer> score = new HashMap<>();

        for (String number : logs){

            score.put(number, score.getOrDefault(number, 0) + 1);
        }
        List <Map.Entry<String,Integer>> Platelist = new ArrayList<>();
        for (Map.Entry<String, Integer> noOfPlate : score.entrySet()){
            Platelist.add(noOfPlate);
            System.out.println(noOfPlate.getKey() + " : " + noOfPlate.getValue());
        }
    System.out.println(Platelist);
        Platelist.sort((p1,p2) -> p1.getValue()-p2.getValue());
    System.out.println("Sorted by Value");
    for (Map.Entry<String,Integer> finalPlate : Platelist){
        System.out.println(finalPlate.getKey() + " : " + finalPlate.getValue());
    }
    Platelist.sort((p3,p4) -> p3.getKey().compareTo(p4.getKey()));
    System.out.println("Sorted by Key");
    for (Map.Entry<String,Integer> finalPlate : Platelist){
        System.out.println(finalPlate.getKey() + " : " + finalPlate.getValue());
    }


    }
}
