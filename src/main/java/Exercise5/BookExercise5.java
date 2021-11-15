package Exercise5;

import java.util.function.Function;

public class BookExercise5 {

    public static void main(String[] args) {

        MyFunctionalInterface getArray = ArrayList<String>::new;

        Function<ArrayList, ArrayList> a1 =  ArrayList<String>::new;  // Constructor Reference
        Function<ArrayList, ArrayList> a2 =  (arrayList) -> new ArrayList<String>(arrayList);  // Constructor Reference

    }//end main

}
