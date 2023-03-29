import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class LonelyInteger {

    public static void main(String[] args) {
        ArrayList<Integer> testArr = new ArrayList<Integer>();
        testArr.add(1);
        testArr.add(2);
        testArr.add(3);
        testArr.add(4);
        testArr.add(3);
        testArr.add(2);
        testArr.add(1);
        System.out.println(lonelyInteger(testArr));

    }


    public static int lonelyInteger(List<Integer> a) {
        ArrayList<Integer> t = new ArrayList<Integer>();
        for (Integer i : a) {
            if (t.contains(i)) {
                t.remove(i);
            } else {
                t.add(i);
            }
        }
        return t.get(0);
    }

}
