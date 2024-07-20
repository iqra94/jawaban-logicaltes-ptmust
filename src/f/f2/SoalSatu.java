import java.util.Scanner;

public class SoalSatu {
    public static void main(String[] args) {
        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input one line of words (S) : ");
        String input = scanner.nextLine();
        scanner.close();

        // Memanggil metode untuk memisahkan huruf vokal dan konsonan
        separateVowelsAndConsonants(input);
    }

    // Metode untuk memisahkan huruf vokal dan konsonan
    private static void separateVowelsAndConsonants(String input) {
        // Mengonversi input menjadi huruf kecil untuk konsistensi
        input = input.toLowerCase();

        // Variabel untuk menyimpan karakter vokal dan konsonan
        StringBuilder vowelCharacters = new StringBuilder();
        StringBuilder consonantCharacters = new StringBuilder();

        // Memproses setiap karakter dalam input
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Memeriksa apakah karakter adalah vokal atau konsonan
            if (isVowel(currentChar)) {
                vowelCharacters.append(currentChar);
            } else if (Character.isLetter(currentChar)) {
                consonantCharacters.append(currentChar);
            }
        }

        // Menampilkan output
        System.out.println("Vowel Characters : " + vowelCharacters);
        System.out.println("Consonant Characters : " + consonantCharacters);
    }

    // Metode untuk memeriksa apakah karakter adalah vokal
    private static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}
