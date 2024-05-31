
import java.util.ArrayList;

public class LargestElement {

    public static void LargestElement(ArrayList<Integer> list) {
        Integer maxElement = Integer.MIN_VALUE;
        for (int i : list) {
            if (i > maxElement) {
                maxElement = i;
            }
        }
        System.err.println("Largest element is: " + maxElement);
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(10);
        list.add(11);
        list.add(19);
        list.add(20);
        list.add(-22);

        LargestElement(list);
    }
}
