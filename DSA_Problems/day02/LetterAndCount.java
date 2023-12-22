package day02;

public class LetterAndCount {
    public static void main(String[] args) {
        String s = "aabbccddd";
		int count = 1;

		for (int i = 0; i < s.length() -1; i++) {
			
			if (s.charAt(i) == s.charAt(i + 1)) {
				count++;
			}
			
			else {
				System.out.print(s.charAt(i) + "" + count);
				count = 1; 
			}
			
			
		}
		
		System.out.println(s.charAt(s.length()-1)+""+count);
    }
    
}
