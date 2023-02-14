/*(Perform set operations on hash sets) Given two stacks of textbooks of the following subjects 5"Chemistry", "Mathematics", "Biology", "English"6
and 5"Biology", "English", "Geography", "Physics"6 respectively, find 
the subjects that are (1) only present in the first stack; (2) only present in the 
second stack; (3) present in both stacks. (You may clone the sets to preserve the 
original sets from being changed by set methods.)*/

package assignment_3;

import java.util.*;

public class Hashset1 {
    public static void main(String[] args) {
        Set<String> firstStack = new HashSet<>();
        firstStack.add("Chemistry");
        firstStack.add("Mathematics");
        firstStack.add("Biology");
        firstStack.add("English");

        Set<String> secondStack = new HashSet<>();
        secondStack.add("Biology");
        secondStack.add("English");
        secondStack.add("Geography");
        secondStack.add("Physics");
        
        Set<String> firstStackClone = new HashSet<>(firstStack);
        Set<String> secondStackClone = new HashSet<>(secondStack);

        firstStackClone.removeAll(secondStack);
        System.out.println("Subjects present in the first stack: " + firstStackClone);

     
        secondStackClone.removeAll(firstStack);
        System.out.println("Subjects present in the second stack: " + secondStackClone);

        
        firstStack.retainAll(secondStack);
        System.out.println("Subjects present in both stacks: " + firstStack);
    }
}
