import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountingSort {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>(Collections.nCopies(100, 0));
        arr.set(5, 5);
        arr.set(6, 5);
        arr.set(7, 5);

        List<Integer> counts = countingSort(arr);
        for (Integer i : counts) {
            System.out.println(i);
        }
    }


    public static List<Integer> countingSort(List<Integer> arr) {
        List<Integer> ret = new ArrayList<Integer>(Collections.nCopies(100, 0));
        for (int i = 0; i<arr.size(); i++) {
            int temp = arr.get(i)+1;
            ret.set(i, temp);
        }
        return ret;
    }

}
