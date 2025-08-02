package lab3;
import java.util.Scanner;
import java.util.Arrays;
public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first string: ");
	        String str1 = scanner.nextLine();

	        System.out.print("Enter the second string: ");
	        String str2 = scanner.nextLine();

	        if (areAnagrams(str1, str2)) {
	            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
	        } else {
	            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
	        }

	        scanner.close();
	    }

	    public static boolean areAnagrams(String s1, String s2) {
	        if (s1 == null || s2 == null || s1.length() != s2.length()) {
	            return false;
	        }

	        s1 = s1.toLowerCase();
	        s2 = s2.toLowerCase();

	        char[] charArray1 = s1.toCharArray();
	        char[] charArray2 = s2.toCharArray();

	        Arrays.sort(charArray1);
	        Arrays.sort(charArray2);

	        return Arrays.equals(charArray1, charArray2);
	}

}
