public class TrappingRainwater {
    public static void main(String arg[]){
        int arr[] = {4,2,0,3,2,5};
        int leftmax[] = new int[arr.length];
        int rightmax[] = new int[arr.length];
        leftmax[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            leftmax[i] = Math.max(leftmax[i-1], arr[i]);
        }
        rightmax[arr.length-1] = arr[arr.length-1];
        for(int i = arr.length-2; i >= 0; i--){
            rightmax[i] = Math.max(rightmax[i+1], arr[i]);
        }

        int trappedwater = 0;
        for(int i = 0; i < arr.length; i++){
           int waterlevel = Math.min(rightmax[i], leftmax[i]);
           trappedwater += waterlevel - arr[i];
        }
        System.out.println("Trapped Water: " + trappedwater);
    }
    
}
