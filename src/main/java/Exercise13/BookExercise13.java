package Exercise13;
import java.util.*;
import java.security.*;
import java.util.stream.IntStream;
/*17.16 (IntStream Filtering and Sorting) Use SecureRandom
method ints to generate a stream of 50 random numbers in the range 1 to
999, then filter the resulting stream elements to select only the odd
numbers and display the results in sorted order.*/

public class BookExercise13 {
    public static void main(String[] args) {
        Random rand = new SecureRandom();
        IntStream ints = rand.ints(50, 1, 999)
                .filter(i -> i % 2 != 0)
                .sorted();

        ints.forEach(i -> System.out.println(i));

    }//end main
}
