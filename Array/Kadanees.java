import java.util.Scanner;
public class Kadanees {
     public static void main(String arg[]){
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array");;
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc . nextInt();
        }
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i = 0; i < arr.length; i++){

            currsum += arr[i];
            if(currsum < 0){
                currsum  = 0;
            }
            else if(currsum > maxsum){
                maxsum = currsum;
            }
           
        
        }
        
System.out.println("max array: " +maxsum);
sc.close();

     }
}
