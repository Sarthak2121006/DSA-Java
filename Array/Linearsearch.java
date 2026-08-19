import java.util.Scanner;
public class Linearsearch {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int key, i;
        int array[] = new int[10];
        System.out.println("Enter 10 numbers:");
        for( i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the number to search:");

        key = sc.nextInt();
        for(i=0; i<array.length; i++){
            if(array[i] == key){
                System.out.println("Number found at index: " + i);
                break;
            }
        }
        if(i == array.length){
            System.out.println("Number not found in the array.");
        }
        sc.close();
    }
}
