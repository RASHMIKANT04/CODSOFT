

import java.util.Scanner;

public class StudentResults {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int subjects = 5;
        int totalMarks = 0;
        
        System.out.println("Enter marks for " + subjects + " subjects (out of 100):");
        for (int i = 0; i < subjects; i++) {
            totalMarks += sc.nextInt();
        }
        
        double averagePercentage = totalMarks / (double) subjects;
        String grade;

        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade: " + grade);
    }
}
