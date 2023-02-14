/*(Display non duplicate names in ascending order) Given one or more text files, 
each representing a day’s attendance in a course and containing the names of the 
students who attended the course on that particular day, write a program that displays,
 in ascending order, the names of those students who have attended at least 
one day of the course. The text file(s) is/are passed as command-line argument(s).
*/
package assignment_3;

import java.util.*;

public class Hashset2 {
    public static void main(String[] args) {
        Set<String> students = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the names of students who have attended the course (enter 'q' to quit):");
        while (true) {
            System.out.print("Name: ");
            String name = sc.nextLine();
            if (name.equals("None")) {
                break;
            }
            students.add(name);
        }

        Set<String> sortedStudents = new TreeSet<>(students);

        System.out.println("\nStudents who have attended the course:");
        for (String name : sortedStudents) {
            System.out.println(name);
        }
        System.out.println("\nTotal number of students: " + sortedStudents.size());
    }
}