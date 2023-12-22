package day02;

public class SubString {

    public static void main(String[] args) {
        String input = "fun";
		int length = input.length();
		String[] substrings = new String[length * (length + 1) / 2];

		int index = 0;
		for (int i = 0; i < length; i++) {
			
			for (int j = i + 1; j <= length; j++) {
				substrings[index++] = input.substring(i, j);
			}
		}
        for (String substring : substrings) {
			System.out.println(substring);
		}
    }
    
}
