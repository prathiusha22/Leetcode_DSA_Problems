package day03;

public class AddString {
    public static void main(String[] args) {
        String str = "Mr john smith";
		    
	        char[] arr = str.toCharArray();
	        
	        StringBuilder sb = new StringBuilder();
	        
	        for (int i = 0; i < arr.length; i++) {
	        	
	            if (arr[i] == ' ') {
	                sb.append("%20");
	            } else {
	                sb.append(arr[i]);
	            }
	            
	        }

	        System.out.println(sb.toString());

    }
    
}
