import java.util.HashSet;
import java.util.Scanner;

public class PangramChecker {
    public static boolean isPangram(String str) {
        str = str.toLowerCase(); // Convert the input to lowercase for case insensitivity
        HashSet<Character> letters = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters.add(ch);
            }
        }

        return letters.size() == 26; // There are 26 letters in the English alphabet
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        boolean result = isPangram(input);

        if (result) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

        scanner.close();
    }
}
