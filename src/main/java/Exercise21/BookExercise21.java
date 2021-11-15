package Exercise21;

import Print_and_Scann.ScannerClass;

import java.util.stream.IntStream;

public class BookExercise21 {


    /* Use an infinite stream of
integers to display the first n prime numbers, where n is input by the user.*/

    public static void main(String[] args) {

        ScannerClass in = new ScannerClass();//scanner class


        System.out.println("Enter a number: ");
        int n = in.getNumber();

        int[] primes = IntStream.iterate(2, i -> i + 1)
                .filter(i -> IntStream.range(2, i).noneMatch(j -> i % j == 0))
                .map(
                        i -> {
                            System.out.println(i + " is a prime number");
                            return i;
                        })

                .limit(n)
                .toArray();

    }//main
}
