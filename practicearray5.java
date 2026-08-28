import java.util.Scanner;
public class practicearray5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the element you want to find out:");
        int num = sc.nextInt();
        int[] arr ={5,10,15,23,34};
        boolean found = false;

for (int i = 0; i < arr.length; i++) {
    if (arr[i] == num) {
        found = true;
    }
}

if (found) {
    System.out.println("Found element");
} else {
    System.out.println("Not found");
}
    sc.close();
}
}
