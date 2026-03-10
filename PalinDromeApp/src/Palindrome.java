public class Palindrome {
import java.util.Scanner;
import java.util.Stack;


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            PalindromeStrategy strategy = new StackStrategy();

            if (strategy.check(input)) {
                System.out.println("\"" + input + "\" is a palindrome!");
            } else {
                System.out.println("\"" + input + "\" is NOT a palindrome.");
            }

            scanner.close();
        }
    }

    interface PalindromeStrategy {
        boolean check(String input);
    }

    class StackStrategy implements PalindromeStrategy {
        public boolean check(String input) {
            Stack<Character> stack = new Stack<>();

            for (char c : input.toCharArray()) {
                stack.push(c);
            }

            for (char c : input.toCharArray()) {
                if (c != stack.pop()) {
                    return false;
                }
            }

            return true;
        }
    }



