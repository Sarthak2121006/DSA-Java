import java.util.Scanner;

public class ArrayPair {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter 10 numbers:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The pairs of numbers are:");
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.println("(" + arr[i] + ", " + arr[j] + ")");
            }
        }   
        sc.close();
    }
    
}
