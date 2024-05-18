import java.util.Scanner;

class One {
    int n;
    int[] id;
    String[] name;
    String[] f_name;
    String[] course;

    Scanner sc = new Scanner(System.in);

    public void menu() {
        while (true) {
            System.out.println("1. Add Student details");
            System.out.println("2. Display student details");
            System.out.println("3. Exit");
            System.out.println("Enter your choice");
            int opt = sc.nextInt();

            if (opt == 1) {
                Data();
            } else if (opt == 2) {
                Display();
            } else if (opt == 3) {
                return;
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }
    }

    public void Data() {
        System.out.println("Enter number of students");
        n = sc.nextInt();
        id = new int[n];
        name = new String[n];
        f_name = new String[n];
        course = new String[n];
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("Enter student id");
            id[i] = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter student Name");
            name[i] = sc.nextLine();
            System.out.println("Enter Student Father_Name");
            f_name[i] = sc.nextLine();
            System.out.println("Enter Course Name");
            course[i] = sc.nextLine();
        }
    }

    public void Display() {
        for (int i = 0; i < n; i++) {
            System.out.println("Student Id is:- " + id[i]);
            System.out.println("Name of the student:- " + name[i]);
            System.out.println("Student father name:- " + f_name[i]);
            System.out.println("Course Name:- " + course[i]);
        }
    }
}

public class Ram {
    public static void main(String[] args) {
        One obj = new One();
        obj.menu();
    }
}
