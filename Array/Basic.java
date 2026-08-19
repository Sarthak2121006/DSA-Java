import java.util.Scanner;
public class Basic {
    public static void main(String main[]){

        int mark[] = new int[5];
        int totalsum = 0; 
        float percentage = 0;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter marks for 5 subjects:");

        System.out.print("C :");
        mark[0] = sc.nextInt();
        System.out.print("C++ :");
        mark[1] = sc.nextInt();
        System.out.print("JAVA :");
        mark[2] = sc.nextInt();
        System.out.print("Python :");
        mark[3] = sc.nextInt();
        System.out.print("JavaScript :");
        mark[4] = sc.nextInt();

        System.out.println("Marks of 5 subjects are:");
        for(int i=0; i<mark.length; i++){
            System.out.println(mark[i]);
            totalsum += mark[i]; 
        }
        
        // Calculate percentage once after the loop finishes using the totalsum
        percentage = totalsum / 5.0f;
        
        System.out.println("Total Marks: " + totalsum);
        System.out.println("Percentage: " + percentage + "%");
        
        sc.close();
    }
}
