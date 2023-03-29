import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        {
            long positive = 0;
            long negative = 0;
            long zero = 0;
            double length = arr.size();

            for (Integer i : arr) {
                if (i.intValue() > 0) {
                    positive++;
                } else if (i.intValue() < 0) {
                    negative++;
                } else {
                    zero++;
                }
            }
            System.out.println(positive / length);
            System.out.println(negative / length);
            System.out.println(zero / length);

        }
    }

}
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        Result.plusMinus(arr);
//
//        bufferedReader.close();
//    }
//}
