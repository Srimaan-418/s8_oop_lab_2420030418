package lab3;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char result = findFirstNonRepeating(input);

        if (result != '\u0000') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("There are no non-repeating characters in the string.");
        }

        scanner.close();
    }

    public static char findFirstNonRepeating(String s) {
        if (s == null || s.isEmpty()) {
            return '\u0000';
        }

        Map<Character, Integer> charCounts = new HashMap<>();

        for (char c : s.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray()) {
            if (charCounts.get(c) == 1) {
                return c;
            }
        }

        return '\u0000';
    }
}
