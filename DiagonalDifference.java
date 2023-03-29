import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        List<Integer> rowOne = new ArrayList<Integer>();
        List<Integer> rowTwo = new ArrayList<Integer>();
        List<Integer> rowThree = new ArrayList<Integer>();
        List<Integer> rowFour = new ArrayList<Integer>();
        List<Integer> rowFive = new ArrayList<Integer>();

        rowOne.add(4);
        rowTwo.add(-1);
        rowTwo.add(1);
        rowTwo.add(-7);
        rowTwo.add(-8);
        rowThree.add(-10);
        rowThree.add(-8);
        rowThree.add(-5);
        rowThree.add(-2);
        rowFour.add(0);
        rowFour.add(9);
        rowFour.add(7);
        rowFour.add(-1);
        rowFive.add(4);
        rowFive.add(4);
        rowFive.add(-2);
        rowFive.add(1);

        arr.add(rowOne);
        arr.add(rowTwo);
        arr.add(rowThree);
        arr.add(rowFour);
        arr.add(rowFive);

        System.out.println(diagonalDifference(arr));

    }


    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftToRight = 0;
        int rightToLeft = 0;
        int n = arr.size()-1;

        for (int i=n; i>=0; i--) {
            if (arr.size() > (n-i) && arr.get(n-i).size() > (n-1)) {
                rightToLeft += Math.abs(arr.get(n-i).get(i));
            }
        }

        for (int i=0; i<n+1; i++) {
            if (arr.size() > i && arr.get(i).size() > i) {
                leftToRight += Math.abs(arr.get(i).get(i));
            }
        }

        if (leftToRight < 0) {
            leftToRight *= -1;
        }
        if (rightToLeft < 0) {
            rightToLeft *= -1;
        }

        int difference = leftToRight - rightToLeft;
        if (difference < 0) {
            difference *= -1;
        }

        return difference;
    }


}
