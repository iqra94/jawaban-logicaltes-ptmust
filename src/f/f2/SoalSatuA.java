import java.util.Scanner;

public class SoalSatuA {
    public String procVowel(String param) {
        String vowels = "aeiouAEIOU";
        StringBuilder result = new StringBuilder();

        for (char c : param.toCharArray()) {
            if (vowels.contains(String.valueOf(c))) {
                result.append(c);
            }
        }

        return result.toString();
    }

    public String procConsonant(String param) {
        String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        StringBuilder result = new StringBuilder();

        for (char c : param.toCharArray()) {
            if (consonants.contains(String.valueOf(c))) {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input one line of words (S) : ");
        String input = scanner.nextLine();

        SoalSatuA program = new SoalSatuA();

        String charVowel = program.procVowel(input);
        String charConsonant = program.procConsonant(input);

        System.out.println("Vowel Characters : ");
        System.out.println(charVowel);
        System.out.println("Consonant Characters : ");
        System.out.println(charConsonant);
    }
}
