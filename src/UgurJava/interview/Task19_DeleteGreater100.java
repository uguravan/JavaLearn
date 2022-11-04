package UgurJava.interview;

import java.util.ArrayList;
import java.util.List;

public class Task19_DeleteGreater100 {
    /*
19 -->> Given a list of Integers 1, 2, 3, 4, 5, 6......etc. remove all values greater than 100.
(same as 12)
*/
    public static void main(String[] args) {
        ArrayList<Integer> numArray = new ArrayList<>(List.of(99,9,100,555,19,333));
        System.out.println(numArray);
        for (int i=0 ; i<numArray.size() ; i++) {
            if (numArray.get(i)>100){
                numArray.remove(i);
            }
        }
        System.out.println(numArray);
    }
}
