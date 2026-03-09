
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";
        String normalized = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        boolean isPalindrome = true;

        // 2. Compare characters from both ends (Logic from hint)
        for (int i = 0; i < normalized.length() / 2; i++) {

            // Compare symmetric characters
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    private static boolean check(String s, int start, int end) {

        if (start >= end) {
            return true;}

        // If characters don't match
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call moving inward
        return check(s, start + 1, end - 1);
    }
}
