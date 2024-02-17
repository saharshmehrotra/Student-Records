import java.util.Scanner;

public class UserInput {
    Scanner scanner = new Scanner(System.in);
    String name, dob;
    int prn;

    // Method to input student details and return them as an Object array
    public Object[] inputStudent() {
        // Prompt user to enter name, PRN, and DOB
        System.out.println("Enter the name: ");
        name = scanner.next();
        System.out.println("Enter the PRN: ");
        prn = scanner.nextInt();
        System.out.println("Enter the DOB: ");
        dob = scanner.next();

        // Store the input values in an Object array
        Object[] array = new Object[3];
        array[0] = name;
        array[1] = prn;
        array[2] = dob;

        return array; // Return the Object array containing student details
    }
}