import java.util.Scanner;
public class LargestArray {
    public static void main(String arg[]){
        System.out.println("Enter 5 numbers to find the largest among them:");
        Scanner sc = new Scanner(System.in);
        int array[] = new int[5];
        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
        int Largest = Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++){
            if(Largest < array[i]){
                Largest = array[i];
            }
        }
        System.out.println("The largest number is: " + Largest);
sc.close();
    }
    
}
