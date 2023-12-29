package day04;

public class StringCheck {
    public static void main(String[] args) {
        String s="aaabbb";
   for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'b'){
                for(int j = i+1; j < s.length(); j++){
                    if(s.charAt(j) == 'a'){
                        System.out.println("false");
                    }
                }
            }
        }
        System.out.println("true"); 
    }
}
