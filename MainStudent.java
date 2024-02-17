import java.util.Scanner;

public class MainStudent {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        UserInput userInput = new UserInput(); // Create an instance of UserInput to handle user input

        System.out.println("Enter number of records: ");
        int n = scanner.nextInt(); // Read the number of student records to be entered

        Student[] students = new Student[n]; // Create an array to store student objects

        // Input student details
        for (int i = 0; i < n; i++) {
            Object[] detailStudent = userInput.inputStudent(); // Get student details from the user

            // Create a new Student object and set its properties using the input
            students[i] = new Student();
            students[i].setName((String) detailStudent[0]);
            students[i].setPRN((Integer) detailStudent[1]);
            students[i].setDOB((String) detailStudent[2]);
        }

        // Menu-driven loop to provide options to the user
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Display all records");
            System.out.println("2. Search student by PRN");
            System.out.println("3. Search student by name");
            System.out.println("4. Update student details");
            System.out.println("5. Delete student record");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt(); // Read user's choice

            switch (choice) {
                case 1:
                    Student.display(students); // Display all student records
                    break;
                case 2:
                    Student.searchByPRN(students); // Search for a student by PRN
                    break;
                case 3:
                    Student.searchByName(students); // Search for a student by name
                    break;
                case 4:
                    Student.updateDetails(students); // Update student details
                    break;
                case 5:
                    Student.deleteRecord(students); // Delete a student record
                    break;
                case 6:
                    scanner.close(); // Close the scanner
                    System.exit(0); // Exit the program
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }
}