package hu.nive.ujratervezes.zarovizsga.digitscounter;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DigitsCounter {



     int getCountOfDigits(String s){
         Map<Integer, Integer> numbers = new HashMap<>();
         try {


             int[] intArray = Arrays.stream(s.split(","))
                     .mapToInt(Integer::parseInt)
                     .toArray();
             if(intArray.length ==1 ) return 1;
             for (int i = 1; i < intArray.length; i++) {
                 if (numbers.containsKey(intArray[i-1])) {
                     for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
                         if (entry.getValue().equals(intArray[i])) {
                             entry.setValue(entry.getValue() + 1);
                         }
                     }
                 } else {
                     if (intArray[i - 1] == intArray[i]) {
                         numbers.put(intArray[i], 1);
                     }

                 }

             }
         }
         catch(NullPointerException |NumberFormatException e) {
             return 0;
         }
         return numbers.size();
    }

}
