import java.util.Scanner;

    public class Task_2_GradeCalculator  {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of subjects: ");
            int Subjects, totalMarks, marks;
            Subjects = scanner.nextInt();
            totalMarks = 0;
            for (int i = 1; i <= Subjects; i++) {
                System.out.print("Enter marks obtained in subject " + i + ": ");
                 marks = scanner.nextInt();
                totalMarks += marks;
            }

            double averagePercentage = (double) totalMarks / Subjects;

            char grade;
            if (averagePercentage >= 90) {
                grade = 'A';
            } else if (averagePercentage >= 80) {
                grade = 'B';
            } else if (averagePercentage >= 70) {
                grade = 'C';
            } else if (averagePercentage >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Percentage: " + averagePercentage);
            System.out.println("Grade: " + grade);

        }
    }


