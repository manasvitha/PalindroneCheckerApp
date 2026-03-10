public class Palindrome {
  import java.util.ArrayDeque;
import java.util.Deque;


        public static void main(String[] args) {
            String input = "refer";

            Deque<Character> deque = new ArrayDeque<>();

            for (char c : input.toCharArray()) {
                deque.add(c);
            }

            boolean isPalindrome = true;

            while (deque.size() > 1) {
                char fromFront = deque.removeFirst();
                char fromBack = deque.removeLast();

                if (fromFront != fromBack) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println(input + " is a palindrome.");
            } else {
                System.out.println(input + " is not a palindrome.");
            }
        }
    }

