import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;
public class PalindromeCheckerApp {
    static final String APP_NAME = "Palindrome Checker App";
    static final String APP_VERSION = "Version 1.0";
    public static void main(String[] args) {
        System.out.println("=======================================");
        System.out.println(" Welcome to " + APP_NAME);
        System.out.println(" " + APP_VERSION);
        System.out.println("=======================================");
        System.out.println("This application checks whether a given");
        System.out.println("string is a palindrome.");
        System.out.println("---------------------------------------");
        System.out.println("Program initialized successfully.");
        System.out.println("Proceeding to Palindrome Processing...");

        //uc2
        String word = "madam";
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        System.out.println("Given Word: " + word);
        if (word.equals(reversed)) {
            System.out.println("Result: The given word is a Palindrome.");
        } else {
            System.out.println("Result: The given word is NOT a Palindrome.");
        }
        System.out.println("Program Completed.");

    //uc3
                String original = "racecar";
                String reverse = "";
                for (int i = original.length() - 1; i >= 0; i--) {
                    reverse = reverse + original.charAt(i);
                }
                System.out.println("Original String: " + original);
                System.out.println("Reversed String: " + reverse);
                if (original.equals(reverse)) {
                    System.out.println("Result: The string is a Palindrome.");
                } else {
                    System.out.println("Result: The string is NOT a Palindrome.");
                }

                System.out.println("Program Completed.");
        //uc4

                String input = "level";
                char[] characters = input.toCharArray();
                int start = 0;
                int end = characters.length - 1;
                boolean isPalindrome = true;
                while (start < end) {
                    if (characters[start] != characters[end]) {
                        isPalindrome = false;
                        break;
                    }
                    start++;
                    end--;
                }
                System.out.println("Input String: " + input);
                if (isPalindrome) {
                    System.out.println("Result: The string is a Palindrome.");
                } else {
                    System.out.println("Result: The string is NOT a Palindrome.");
                }
                System.out.println("Program Completed.");

        //uc5
        input = "noon";
                Stack<Character> stack = new Stack<>();
                for (char c : input.toCharArray()) {
                    stack.push(c);
                }
        isPalindrome = true;
                for (char c : input.toCharArray()) {
                    if (c != stack.pop()) {
                        isPalindrome = false;
                        break;
                    }
                }
                System.out.println("Input : " + input);
                System.out.println("Is Palindrome? : " + isPalindrome);

    //uc6
        input = "civic";
                Queue<Character> queue = new LinkedList<>();
        stack = new Stack<>();
                for (char c : input.toCharArray()) {
                    queue.add(c);      // FIFO
                    stack.push(c);     // LIFO
                }
        isPalindrome = true;
                while (!queue.isEmpty()) {

                    char fromQueue = queue.remove();  // front element
                    char fromStack = stack.pop();     // top element

                    if (fromQueue != fromStack) {
                        isPalindrome = false;
                        break;
                    }
                }
                System.out.println("Input : " + input);
                System.out.println("Is Palindrome? : " + isPalindrome);

        //uc7
        input = "refer";
                Deque<Character> deque = new ArrayDeque<>();
                for (char c : input.toCharArray()) {
                    deque.addLast(c);
                }
        isPalindrome = true;
                while (deque.size() > 1) {
                    char front = deque.removeFirst();
                    char rear = deque.removeLast();

                    if (front != rear) {
                        isPalindrome = false;
                        break;
                    }
                }
                System.out.println("Input : " + input);
                System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

