import java.util.*;

public class SoalSatuB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.println("Enter a line of words:");
        String input = scanner.nextLine();

        // Process and output
        String result = sortVowelsAndConsonants(input);
        System.out.println("Output:");
        System.out.println(result);

        scanner.close();
    }

    private static String sortVowelsAndConsonants(String input) {
        List<Character> vowels = new ArrayList<>();
        List<Character> consonants = new ArrayList<>();

        // Process the input
        for (char ch : input.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                if (isVowel(ch)) {
                    vowels.add(ch);
                } else {
                    consonants.add(ch);
                }
            }
        }

        // Build the result string
        StringBuilder result = new StringBuilder();
        result.append("Vowels: ");
        appendSortedCharacters(result, vowels);
        result.append("\nConsonants: ");
        appendSortedCharacters(result, consonants);

        return result.toString();
    }

    private static void appendSortedCharacters(StringBuilder result, List<Character> characters) {
        characters.sort(Comparator.naturalOrder());
        for (char ch : characters) {
            result.append(ch).append(" ");
        }
    }

    private static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}
