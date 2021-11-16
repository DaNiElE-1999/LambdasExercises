package Exercise19;
import java.util.*;
public class BookExercise19 {

    /*17.22 (Calculating the Average of the Elements in a Two-Dimensional
Array) Figure 7.19 defined a two-dimensional array of grades with 10
rows and three columns, representing 10 students’ grades on three exams.
Use streams to calculate the students’ individual averages.

 */

    public static void main(String[] args) {
        double[][] grades = {{87, 96, 70}, {68, 87, 90}, {94, 100, 90}, {100, 81, 82}, {83, 65, 85},
        {78, 87, 65}, {85, 75, 83}, {91, 94, 100}, {76, 72, 84}};

        double[] averages = new double[grades.length];

        Arrays.stream(grades).forEach(row -> {
            Arrays.stream(row).average().ifPresent(average -> System.out.println(average));});


    }//end main
}
