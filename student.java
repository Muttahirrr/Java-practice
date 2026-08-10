import java.util.Scanner;
public class student{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the student name");
        String name=sc.nextLine();
        System.out.println("Enter the student age");
        int age=sc.nextInt();
        System.out.println("Enter the student height");
        float height=sc.nextFloat();
        System.out.println("Enter the student weight");
        float weight=sc.nextFloat();
        sc.nextLine();
        System.out.println("Enter the student's college name");
        String college=sc.nextLine();
        boolean isstudent=(age<=18);
        System.out.println("Is the person a student? " + isstudent);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("College: " + college);
        System.out.println("Is Student: " + isstudent);
        if(isstudent){
            System.out.println("You are a student");
        }else{
            System.out.println("BYE BYE");
        }
        sc.close();
    }

}