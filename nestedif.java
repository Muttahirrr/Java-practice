import java.util.Scanner;
public class nestedif {
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age= sc.nextInt();
        sc.nextLine();
        if(age >=18){
             System.out.println("Do you have an ID ?(yes/no)");
             String id = sc.nextLine();
            if(id.equals("yes")){
                System.out.println("You can proceed.");
            }
            else{
                System.out.println("You need an ID to proceed.");
            }
        }
        else{
            System.out.println("You are not old enough to proceed.");
        }
        sc.close();
    }
}
