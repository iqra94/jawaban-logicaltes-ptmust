import java.util.Scanner;

public class SoalDua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah keluarga
        System.out.print("Input the number of families: ");
        int numFamilies = scanner.nextInt();

        // Input jumlah anggota keluarga
        System.out.print("Input the number of members in the family (separated by a space): ");
        int[] familyMembers = new int[numFamilies];
        for (int i = 0; i < numFamilies; i++) {
            familyMembers[i] = scanner.nextInt();
        }

        // Validasi jumlah keluarga dan jumlah anggota keluarga
        if (numFamilies != familyMembers.length) {
            System.out.println("Input must be equal with count of family");
            return;
        }

        // Menghitung total anggota keluarga dan menentukan jumlah bus minimum
        int totalMembers = 0;
        for (int members : familyMembers) {
            totalMembers += members;
        }

        int minBuses = (int) Math.ceil((double) totalMembers / 4);

        // Output hasil
        System.out.println("Minimum bus required is: " + minBuses);
    }
}
