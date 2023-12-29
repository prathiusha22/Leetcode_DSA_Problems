public class LeaderElements {
    public static void main(String[] args) {

        int[] arr = { 9, 5, 3, 2, 4, 5, 1 };
        int n = 7;

        // for (int i = 0; i < n - 1; i++) {
        // int flag = 0;
        // for (int j = i + 1; j < n; j++) {
        // if (arr[i] < arr[j]) {
        // flag = 1;
        // break;
        // }
        // }
        // if (flag == 0) {
        // System.out.println(arr[i]);
        // }
        // }

        // System.out.println(arr[arr.length-1]);

        
        // time complexity
        int max = arr[arr.length - 1];
        System.out.println(arr[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= max) {
                max = arr[i];
                System.out.println(max);
            }
        }

    }
}
