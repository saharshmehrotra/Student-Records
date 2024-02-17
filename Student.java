import java.util.Scanner;

public class Student {
    // Instance variables
    private String name;
    private int prn;
    private String dob;

    // Setter and Getter methods for name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Setter and Getter methods for PRN
    public void setPRN(int prn) {
        this.prn = prn;
    }

    public int getPRN() {
        return prn;
    }

    // Setter and Getter methods for DOB
    public void setDOB(String dob) {
        this.dob = dob;
    }

    public String getDOB() {
        return dob;
    }

    // Display all records
    public static void display(Student[] students) {
        int count = 1;
        System.out.println("\n_____________________Records____________________");
        for (Student student : students) {
            System.out.println("__________" + count + " Record__________");
            System.out.println("Name of Student: " + student.getName());
            System.out.println("PRN of Student: " + student.getPRN());
            System.out.println("DOB of Student: " + student.getDOB());

            count++;
        }
    }

    // Search student by PRN
    public static void searchByPRN(Student[] students) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter PRN to search: ");
        int prn = scanner.nextInt();

        boolean found = false;
        for (Student student : students) {
            if (student.getPRN() == prn) {
                System.out.println("Student found:");
                System.out.println("Name: " + student.getName());
                System.out.println("PRN: " + student.getPRN());
                System.out.println("DOB: " + student.getDOB());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with PRN " + prn + " not found.");
        }
    }

    // Search student by name
    public static void searchByName(Student[] students) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name to search: ");
        String name = scanner.next();

        boolean found = false;
        for (Student student : students) {
            if (student.getName().equals(name)) {
                System.out.println("Student found:");
                System.out.println("Name: " + student.getName());
                System.out.println("PRN: " + student.getPRN());
                System.out.println("DOB: " + student.getDOB());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with name " + name + " not found.");
        }
    }

    // Update student details
    public static void updateDetails(Student[] students) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter PRN of student to update details: ");
        int prn = scanner.nextInt();

        boolean found = false;
        for (Student student : students) {
            if (student.getPRN() == prn) {
                System.out.print("Enter new name: ");
                String newName = scanner.next();
                System.out.print("Enter new DOB: ");
                String newDOB = scanner.next();

                student.setName(newName);
                student.setDOB(newDOB);
                System.out.println("Details updated successfully.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with PRN " + prn + " not found.");
        }
    }

    // Delete student record
    public static void deleteRecord(Student[] students) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter PRN of student to delete record: ");
        int prn = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getPRN() == prn) {
                for (int j = i; j < students.length - 1; j++) {
                    students[j] = students[j + 1];
                }
                System.out.println("Record deleted successfully.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with PRN " + prn + " not found.");
        }
    }
}