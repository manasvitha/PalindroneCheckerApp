public class Palindrome {


        public static void main(String[] args) {
            String input = "radar";

            PalindromeService service = new PalindromeService();
            boolean isPalindrome = service.checkPalindrome(input);

            if (isPalindrome) {
                System.out.println(input + " is a palindrome.");
            } else {
                System.out.println(input + " is not a palindrome.");
            }
        }
    }

    class PalindromeService {

        public boolean checkPalindrome(String input) {
            int start = 0;
            int end = input.length() - 1;

            while (start < end) {
                if (input.charAt(start) != input.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }
    }



