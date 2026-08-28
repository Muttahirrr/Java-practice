public class jaggedarray {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        arr[0]=new int[3];
        arr[1]=new int[1];
        arr[2]=new int[4];
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);
        System.out.println(arr[2].length);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }
}
