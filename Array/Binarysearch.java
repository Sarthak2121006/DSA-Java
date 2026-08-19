import java.util.Scanner;

public class Binarysearch {
    public static void main(String arg[]) { 
        int arr[] = new int[5]; // Fixed: Explicitly declared size 5
        int start = 0, end = arr.length - 1, mid, key; 
        boolean found = false;

        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter 5 numbers in sorted order:"); 
        for(int i = 0; i < arr.length; i++) { 
            arr[i] = sc.nextInt(); 
        } 
        
        System.out.println("Enter the number to search:"); 
        key = sc.nextInt(); 
        
        while(start <= end) { 
            mid = start + end/ 2; 
            
            if(arr[mid] == key) { 
                System.out.println("Number found at index: " + mid); 
                found = true; 
                break; 
            } else if(key > arr[mid]) { 
                start = mid + 1; 
            } else { 
                end = mid - 1; 
            } 
        }
        
        if (!found) {
            System.out.println("Number not found in the array.");
        }

        sc.close(); 
    } 
}
