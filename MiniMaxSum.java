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

class MiniMaxSum {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(4);
        arr.add(6);
        arr.add(3);
        arr.add(5);
        arr.add(9);
        arr.add(1);
        miniMaxSum(arr);
    }


    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        long mini = 0;
        for (int i=0; i<4; i++) {
            mini += arr.get(i);
        }

        long max = 0;
        int size = arr.size();
        max += arr.get(size-1);
        max += arr.get(size-2);
        max += arr.get(size-3);
        max += arr.get(size-4);
        System.out.println(mini + " " + max);
    }

}