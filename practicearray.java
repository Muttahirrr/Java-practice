import java.util.Scanner;
public class practicearray{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];
    
    for(int i = 0; i< arr.length; i++){
        System.out.println("Enter element number"+ (i+1) +": ");
        arr[i] = sc.nextInt();
    }

    System.out.println("The elements in the array are: ");

    for(int i=0; i<arr.length; i++){
        System.out.println( arr[i]);
    }
    sc.close();
}   
}