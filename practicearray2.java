import java.util.Scanner;
public class practicearray2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int[] arr = new int[5];
        for(int i = 0; i<arr.length;i++){
            System.out.println("Enter element number" + (i+1) + ":");
            arr[i] = sc.nextInt();
        }
        System.out.println("The sum of the elements in the array is: ");
        for(int i=0; i<arr.length;i++){
            sum += arr[i];
         }
        System.out.println("Sum: " + sum);
        double average = (double)sum/arr.length;
        System.out.println("Average: " + average);

     
    sc.close();
}
}
