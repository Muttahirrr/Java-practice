import java.util.Scanner;
public class practicetwodarray4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][]arr = new int[2][3];
    System.out.println("Enter the elements to find out max");
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    int max=arr[0][2];
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]>max){
                max=arr[i][j];
            }
        }
    } System.out.println("Max is :" + max);


    sc.close();
    }
}