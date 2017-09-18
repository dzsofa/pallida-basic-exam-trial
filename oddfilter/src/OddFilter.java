import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

public class OddFilter {
    public static void main(String[] args) {
        // Create a function that takes a list as a parameter,
        // and returns a new list with every odd element from the orignal list

        ArrayList<Integer> myNumbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(oddFilter(myNumbers));
        // should print [1, 3, 5]
    }

    public static ArrayList<Integer> oddFilter(ArrayList<Integer> sortable) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (int i = 0; i < sortable.size(); i++) {
            if (sortable.get(i) % 2 == 1) {
                oddNumbers.add(sortable.get(i));
            }
        }
        return oddNumbers;
    }
}
