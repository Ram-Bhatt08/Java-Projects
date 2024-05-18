import java.util.Scanner;
class Record {
    void show()
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of the student");
        int n=sc.nextInt();
        String[] name=new String[n];
        String[] f_name=new String[n];
        int[] id=new int[n];
        String[] Course=new String[n];
        int[] Grade=new int[n];
        
        System.out.println("Enter the details of the student");
        for(int i=0;i<n;i++)
        {
            sc.nextLine();
            System.out.println("Enter the name of the student");
            name [i]=sc.nextLine();
            System.out.println("Enter the father name of the student");
            f_name [i]=sc.nextLine();
            System.out.println("Enter the Student id");
            id [i]=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the course of the student");
            Course [i]=sc.nextLine();
            System.out.println("Enter the Grade of the student");
            Grade[i]=sc.nextInt();
            // sc.nextLine();
        }
        System.out.println("The details of the student that we have:-");
        for(int i=0;i<n;i++)
        {
            System.out.println("Name of the student:- " + name[i]);
            System.out.println("Father name of the student:- " + f_name[i]);
            System.out.println("Student ID:- " + id[i]);
            System.out.println("Course of the student :- " +Course[i]);
            System.out.println("The Grade of the student:- " +Grade[i]);
        } 
    }
}
 class Student {
    public static void main(String[]args)
    {
        Record obj=new Record();
        obj.show();
        }
}