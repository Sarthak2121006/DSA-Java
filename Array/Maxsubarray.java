import java.util.Scanner;
public class Maxsubarray {
    public static void main(String arg[]){
        int arr[] = new int[3];
        Scanner sc = new Scanner(System.in);
         System.err.println("Enter the Array");
         for(int i = 0; i < arr.length; i++){
             arr[i] = sc.nextInt();
         } 

        int maxSUM = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            int start = i;
            for(int j = i; j < arr.length; j++)
            {
                int end = j;
                currsum = 0;
                for(int k = start; k <= end; k++)
                {
                    currsum += arr[k];

                }
                System.out.println(currsum);
                if(currsum > maxSUM)
                {
                    maxSUM = currsum;
                }
            }
        }
        System.out.println("max sub array is " + maxSUM);
        sc.close();
    }
    
}