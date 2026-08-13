import java.util.Scanner;
public class grade{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks:");
        int marks = sc.nextInt();
        if (marks <0 || marks >100){
            System.out.println("invalid marks entered.");
        }
        else if (marks >=90){
            System.out.println("A grade");
        }
        else if (marks >=75){
            System.out.println("B grade");
        }
            else if(marks >=60){
                System.out.println("C grade");
            }
            else if(marks >=40){
                System.out.println("D grade");
            }
        else{
            System.out.println("Fail.");
        }
        sc.close();
    }
}
        

