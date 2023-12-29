package day04;

public class LongestSubArray {
    public static void main(String[] args) {
        
        int nums[] = {1,2,3,3,5,2};
            
           int max = 0;
        int count = 1;

        for( int i = 0; i< nums.length ; i++){
            max = Math.max(max , nums[i]);
        }
        int ans = 1;
        for(int i = 0; i< nums.length -1; i++){
            if( nums[i] == nums[i+1] && max == nums[i]){
                count++;
                ans = Math.max(ans , count);
            }
            else{
                ans = Math.max(ans , count);
                count = 1;
            }
        }
        System.out.println(ans); 
}
}
