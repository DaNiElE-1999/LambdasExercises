package Exercise1;

import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class BookExercise1 {

    //Write a lambda expression that receives two double parameters
    //a and b and returns their product. Use the lambda form that
    //explicitly lists the type of each parameter


    public static <GreetingFunction> void main(String[] args) {

        double[] values = {3.9, 10.987, -1.2,-8.1};

        System.out.printf("Product via reduce method: %.2f%n", +
                        DoubleStream.of(values)
               .reduce((x, y) -> x * y).getAsDouble());//implicitly lists the type of each parameter


    }

}


