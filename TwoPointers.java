
import java.util.ArrayList;

public class TwoPointers {

    public static void twoSum(ArrayList<Integer> list, Integer sum) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            int currentSum = list.get(left) + list.get(right);
            if (currentSum == sum) {
                System.out.println(left + " " + right);
                return;
            } else if (currentSum < sum) {
                left++;
            } else if (currentSum > sum) {
                right--;
            }
        }
        System.out.println("Not found");
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

        twoSum(list, 7);

    }
}
