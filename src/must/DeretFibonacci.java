package must;

public class DeretFibonacci {

    public static void main(String[] args) {
        int n = 10; // Jumlah angka dalam deret yang ingin dihasilkan
        cetakDeretFibonacci(n);
    }

    public static void cetakDeretFibonacci(int n) {
        int angka1 = 0, angka2 = 1;

        System.out.print(angka1 + ", " + angka2);

        for (int i = 2; i < n; i++) {
            int angkaBerikutnya = angka1 + angka2;
            System.out.print(", " + angkaBerikutnya);
            angka1 = angka2;
            angka2 = angkaBerikutnya;
        }
    }
}

/**
 3. Buatlah sebuah program yang menghasilkan deret angka sederhana yang susunan angkanya merupakan penjumlahan dari dua angka sebelumnya (0,1,1,2,3,5,8,13,21)
*/