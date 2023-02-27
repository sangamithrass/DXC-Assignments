package setinterface_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Tester {

	public static Set<Student> findUnique(List<Student> students) {
        Set<Student> uniqueStudents = new HashSet<Student>();
        Set<String> emailIds = new HashSet<String>();
        for (Student student : students) {
            if (!emailIds.contains(student.getEmailId())) {
                uniqueStudents.add(student);
                emailIds.add(student.getEmailId());
            }
        }
        return uniqueStudents;
	}

	public static Set<Student> findDuplicates(List<Student> students) {
        
		Set<Student> duplicateStudents = new HashSet<Student>();
        Set<String> emailIds = new HashSet<String>();
        for (Student student : students) {
            if (emailIds.contains(student.getEmailId())) {
                duplicateStudents.add(student);
            } else {
                emailIds.add(student.getEmailId());
            }
        }
        return duplicateStudents;
	}
	
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();

		students.add(new Student(5004, "Wyatt", "Wyatt@example.com","Dance"));
		students.add(new Student(5010, "Lucy", "Lucy@example.com","Dance"));
		students.add(new Student(5550, "Aaron", "Aaron@example.com","Dance"));
		students.add(new Student(5560, "Ruby", "Ruby@example.com","Dance"));
		students.add(new Student(5015, "Sophie", "Sophie@example.com","Music"));
		students.add(new Student(5013, "Clara", "Clara@example.com","Music"));
		students.add(new Student(5010, "Lucy", "Lucy@example.com","Music"));
		students.add(new Student(5011, "Ivan", "Ivan@example.com","Music"));
		students.add(new Student(5550, "Aaron", "Aaron@example.com","Music"));

		Set<Student> studentNominations = findUnique(students);
		System.out.println("Students who have submitted nominations");
		for(Student student: studentNominations)
		    System.out.println(student);

		Set<Student> duplicateStudents = findDuplicates(students);
		System.out.println("\nStudents who have submitted nominations for both the events");
		for(Student student: duplicateStudents)
		    System.out.println(student);
	}
}
