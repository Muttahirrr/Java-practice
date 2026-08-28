public class arrays {
    public static void main(String args[]){
        int[] arr={10,20,30,40,50};
        System.out.println( arr[0]);
        System.out.println( arr[2]);
        System.out.println( arr[4]);

        int[] arr1 = new int[6];
        arr1[1]=60;
        arr1[3]=70;
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);     
        System.out.println(arr.length);
        System.out.println(arr1.length);
        System.out.println(arr1[arr1.length-3]);
}
}