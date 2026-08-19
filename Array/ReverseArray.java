import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers in the array:");
        for(int i = 0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("the original array is:");
        for(int i = 0; i<5; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("the reversed array is:");
        int start = 0, end =arr.length-1; 
        while( start < end){
            int temp =arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int i = 0; i<5; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();

    }
}
