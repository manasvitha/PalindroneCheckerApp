public class Palindrome {
   import java.util.Scanner;
   public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            String reversed = "";

            // Iterate from the last character to the first.
            for (int i = input.length() - 1; i >= 0; i--) {
                reversed += input.charAt(i);
            }

            if (input.equals(reversed)) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
            }

            scanner.close();
        }
    }

