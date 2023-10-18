import java.util.*;

public class FindTopperMarks {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the total number of students
        System.out.print("Enter the total number of students: ");
        int totalStudents = scanner.nextInt();

        // Create an array to store the marks of all students
        int[] marks = new int[totalStudents];

        // Input marks for each student
        for (int i = 0; i < totalStudents; i++) {
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Close the Scanner
        scanner.close();

        // Find the qualified students (students with unique marks)
        Set<Integer> qualifiedStudents = new HashSet<>();
        Set<Integer> duplicateMarks = new HashSet<>();

        for (int i = 0; i < totalStudents; i++) {
            int currentMark = marks[i];
            if (duplicateMarks.contains(currentMark)) {
                // Mark is not unique, so add it to the duplicateMarks set
                duplicateMarks.add(currentMark);
            } else {
                // Mark is unique, so add the student to the qualifiedStudents set
                qualifiedStudents.add(i);
            }
        }

        // Find the topper among the qualified students
        int maxMarks = -1;
        int topperIndex = -1;

        for (int index : qualifiedStudents) {
            if (marks[index] > maxMarks) {
                maxMarks = marks[index];
                topperIndex = index;
            }
        }

        // Check if a topper exists and print the result
        if (topperIndex != -1) {
            System.out.println("Topper's marks: " + maxMarks);
        } else {
            System.out.println("No topper found among the qualified students.");
        }
    }
}
