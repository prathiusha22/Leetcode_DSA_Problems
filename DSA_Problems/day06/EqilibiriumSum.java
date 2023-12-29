public class EqilibiriumSum {

    public static void main(String[] args) {
        int n = 7;
        int[] arr = { 5, 3, 2, 0, 2, 3, 5 };

        int max = -1;
        int prefixsum = 0;
        int suffixsum=0;

        for (int i = 0; i < n; i++) {
            prefixsum += arr[i];
        }

        for (int i = 0; i < n; i++) {
            prefixsum -= arr[i];
            if (prefixsum == suffixsum) {
                max = Math.max(max, prefixsum);
            }
            suffixsum += arr[i];
        }

        System.out.println(max);

    }

}
