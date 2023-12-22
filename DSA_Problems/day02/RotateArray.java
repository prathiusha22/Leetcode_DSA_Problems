package day02;

public class RotateArray {
    
    public static void moveZeros(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int nonZero = 0; 

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[nonZero];
                nums[nonZero] = temp;

                nonZero++;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {5,0,0,7,0,1};
        moveZeros(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    
}
