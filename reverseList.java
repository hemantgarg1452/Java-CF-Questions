import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class reverseList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }

        System.out.println(list);
    }
}

/*
 * Time Complexity: O(n)
 * 
 * Interview tip:
 * ArrayList allows efficient swapping because of O(1) index access.
 */
