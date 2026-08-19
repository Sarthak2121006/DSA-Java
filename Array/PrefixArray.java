import java.util.Scanner;
public class PrefixArray {
    public static void main(String arg[]){
        int arr[] = new int[4];
        Scanner sc = new Scanner(System.in);
         System.err.println("Enter the Array");
         for(int i = 0; i < arr.length; i++){
             arr[i] = sc.nextInt();
         } 
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            prefix[i] = prefix[i-1] + arr[i];
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
                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1 ];
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