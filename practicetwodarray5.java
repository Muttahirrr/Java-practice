import java.util.Scanner;
public class practicetwodarray5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][]arr = new int[2][3];
    System.out.println("Enter the elements to find out min");
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    int min=arr[0][0];
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]<min){
                min=arr[i][j];
            }
        }
    } System.out.println("Min is :" + min);


    sc.close();
    }
}
