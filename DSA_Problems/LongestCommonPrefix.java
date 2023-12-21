public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println( longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String pre = strs[0];

        for (int i = 1; i < strs.length; i++) {
            String currentStr = strs[i];
            int j;
            for (j = 0; j < pre.length() && j < currentStr.length(); j++) {
                if (pre.charAt(j) != currentStr.charAt(j)) {
                    break;
                }
            }
            pre = pre.substring(0, j);

            if (pre.isEmpty()) {
                return "";
            }
        }

        return pre;
    }
}
