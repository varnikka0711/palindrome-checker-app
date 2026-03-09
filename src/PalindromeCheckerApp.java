

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Define input string
        String input = "madam";

        // Call recursive palindrome check
        boolean result = check(input, 0, input.length() - 1);

        // Print results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }

    private static boolean check(String s, int start, int end) {

        // Base condition: all characters checked
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call moving inward
        return check(s, start + 1, end - 1);
    }
}