import java.util.Scanner;

public class SoalDuaA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int n = scanner.nextInt();  // Number of families
        int[] familyMembers = new int[n];

        for (int i = 0; i < n; i++) {
            familyMembers[i] = scanner.nextInt();  // Number of members in each family
        }

        // Check if input is valid
        if (n != familyMembers.length) {
            System.out.println("Input must be equal with count of family");
            return;
        }

        // Calculate minimum number of buses
        int totalMembers = 0;
        for (int members : familyMembers) {
            totalMembers += members;
        }

        // Assuming a bus can carry 50 people
        int busesNeeded = (int) Math.ceil((double) totalMembers / 50);

        // Output
        System.out.println(busesNeeded);

        scanner.close();
    }
}
