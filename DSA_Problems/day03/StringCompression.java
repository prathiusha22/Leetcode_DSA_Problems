package day03;

public class StringCompression {
    public static void main(String[] args) {
        String input = "This car the best day in my life";
        String[] words = input.split("\\s+"); 

        if (words.length >= 2) {
            String secondWord = words[1]; 

            for (String word : words) {
                if (word.length() == secondWord.length()) {
                    System.out.println(word);
                }
            }
        } else {
            System.out.println("Invalid");
        }
    }
}