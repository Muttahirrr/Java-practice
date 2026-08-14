import java.util.Scanner;
public class dowhile {
    public static void main(String args[]){
       int number;
       Scanner sc = new Scanner(System.in);
    do {
    System.out.println("Enter a positive number:");
    number = sc.nextInt();
    } while (number <= 0);
     sc.close();
    }
}
