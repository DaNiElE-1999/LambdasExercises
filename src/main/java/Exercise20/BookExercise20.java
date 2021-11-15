package Exercise20;
import java.util.*;
public class BookExercise20 {
    /*Create a
collection of Person objects in which each Person has a firstName
and a lastName. Use streams to locate the first Person object
containing the last name Jones. Ensure that several Person objects in
your collection have that last name.
*/
    public static void main(String[] args) {
        Collection<Person> people = new ArrayList<>();
        people.add(new Person("John", "Smith"));
        people.add(new Person("John", "Jones"));
        people.add(new Person("Ben", "Jones"));
        people.add(new Person("Genci", "Smith"));
        people.add(new Person("Miri", "Kruja"));
        people.add(new Person("Lenci", "Kalaja"));
        people.add(new Person("Robi", "Roba"));
        people.add(new Person("Iqerem", "Jones"));

        people.stream().filter(p -> p.getLastname().equals("Jones"))
                .findFirst().ifPresent(System.out::println);
    }
}
