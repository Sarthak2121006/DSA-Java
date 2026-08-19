public class p4 {
    public static void main(String arg[]){
        char ch= 'A';
        for(int line = 1; line <= 5; line++)
        {
            for(int iner = 1; iner <= line; iner++){
                System.out.print(ch +" ");
                ch++;
            }
            System.out.println();
        }
    }
    
}
