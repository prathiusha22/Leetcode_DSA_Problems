package day02;

public class MovingOnesToRight {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 1, 0,0,0,0,0,1 };
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] == 0 && left < right) {
                left++;
            }
            if (arr[right] == 1 && left < right) {
                right--;
            }
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        System.out.print("Modified Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
