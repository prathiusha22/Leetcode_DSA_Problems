public class LengthOfTheLastWord {

    public static void main(String[] args) {
          String s = "Hello World";
          System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        String str = s.trim();
        int wc = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                wc++;
            } else {
                break;
            }
        }
        return wc;
    }

}
