package day02;

public class CodeEncryption {
    public static void main(String[] args) {
        String str = "678924";

		char[] arr = str.toCharArray();

		for (int i = 0; i < arr.length - 1; i += 2) {
			char temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
		}

		String result = new String(arr);

		System.out.println("Decrypted code: " + result);

    }
}
