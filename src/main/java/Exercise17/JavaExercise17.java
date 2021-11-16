package Exercise17;
import java.util.*;
import java.util.stream.Collectors;

public class JavaExercise17 {
    /*17.20 (Mapping Integer Grades to Letter Grades) Create a program that
reads integer grades and stores them in an ArrayList, then use stream
processing to display each grade’s letter equivalent (A, B, C, D or F).
*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of grades: ");
        int numberOfGrades = input.nextInt();
        ArrayList<Integer> grades = new ArrayList<Integer>();
        for (int i = 0; i < numberOfGrades; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades.add(input.nextInt());
        }
        System.out.println("\nThe grades are: " + grades);
        System.out.println("\nThe letter grades are: " +
                grades.stream().map(grade -> {
                    if (grade >= 90)
                        return "A";
                    else if (grade >= 80)
                        return "B";
                    else if (grade >= 70)
                        return "C";
                    else if (grade >= 60)
                        return "D";
                    else
                        return "F";
                }).collect(Collectors.toList()));
    }
}
