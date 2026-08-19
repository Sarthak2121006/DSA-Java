import java.util.Scanner;

public class SubArray {
    public static void main(String arg[])
    {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers in the array:");
        for(int i = 0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The subarrays are:");
        for(int i = 0; i<5; i++){
            int start = i;
            for(int j=i; j<5; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
           System.out.println();
           
    }
    sc.close();
    
}
}
