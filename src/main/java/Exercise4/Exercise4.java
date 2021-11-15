package Exercise4;

import java.util.*;

public class Exercise4 {
    //Write a no-argument lambda that implicitly returns the string
    //"Welcome to lambdas!"

    public static void main(String[] args) {

        String[] strings = {"Welcome to lambdas!"};

        Arrays.stream(strings).forEach(System.out::println);//implicitly returns the string

        greetingFunction greet = () -> System.out.println("Welcome to lambdas!");
        greet.operation();//explicitly calling the method

    }
}
