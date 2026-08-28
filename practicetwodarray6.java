import java.util.Scanner;
public class practicetwodarray6 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[][]arr = new int[2][3];
    System.out.println("Enter the elements to find out how many are even");
    int count=0;
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            arr[i][j]=sc.nextInt();
            if(arr[i][j]%2==0){
                count++;
            }
        }
    }
    System.out.println("There are " + count + " Even numbers");
     sc.close();
}
}
