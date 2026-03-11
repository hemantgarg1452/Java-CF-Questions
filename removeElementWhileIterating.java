import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class removeElementWhileIterating {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4));

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {

            Integer val = it.next();

            if (val == 2) {
                it.remove();
            }

        }

        System.out.println(list);
    }
}

// Interview line: Removing elements during iteration should be done using the
// iterator's remove method to avoid ConcurrentModificationException.

/*
 * Ye code error dega:
 * 
 * for(Integer x : list){
 * if(x == 2){
 * list.remove(x);
 * }
 * }
 * 
 * Error: ConcurrentModificationException
 * Reason: Fail Fast Iterator
 * Jab tum collection modify karte ho iteration ke time, iterator detect kar
 * leta hai.
 * 
 */