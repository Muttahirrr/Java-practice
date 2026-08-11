import java.util.Scanner;
public class calculator{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number:");
        int a= sc.nextInt();
        System.out.println("Enter second number:");
        int b= sc.nextInt();
        System.out.println("Choose an operation:+, -, *, /, %");
        char op= sc.next().charAt(0);
        if(op=='+'){
            System.out.println("Result: " + (a+b));

        }
        else if(op=='-'){
            System.out.println("Result: " + (a-b));
        }
        else if(op=='*'){
            System.out.println("Result: " + (a*b));
        }
        else if(op=='/'){
            System.out.println("Result: " + (a/b));
        }
        else if(op=='%'){
            System.out.println("Result: " + (a%b));
        }
        else{
            System.out.println("Invalid choice");
        }
       sc.close();


    }
}