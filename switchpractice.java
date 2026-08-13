import java.util.Scanner;
public class switchpractice{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number between 1 and 5 you want to write in words:");
        int number = scanner.nextInt();
        switch(number){
            case 1:
                System.out.println("One");
                break;
                case 2:
                System.out.println("Two");
                break;
                case 3:
                System.out.println("Three");
                break;
                case 4:
                System.out.println("Four");
                break;
                case 5:
                System.out.println("Five");
                break;
                default:
                    System.out.println("You have entered a number outside the range of 1 to 5.");
        }
        scanner.close();

    }
}