package must;

public class SahamKeuntunganTerbaik {

    public static void main(String[] args) {
        int[] contoh1 = {7, 8, 3, 10, 8};
        int[] contoh2 = {5, 12, 11, 12, 10};
        int[] contoh3 = {7, 18, 27, 10, 29};
        int[] contoh4 = {20, 17, 15, 14, 10};

        System.out.println("Keuntungan terbaik untuk contoh 1: " + keuntunganTerbaik(contoh1));
        System.out.println("Keuntungan terbaik untuk contoh 2: " + keuntunganTerbaik(contoh2));
        System.out.println("Keuntungan terbaik untuk contoh 3: " + keuntunganTerbaik(contoh3));
        System.out.println("Keuntungan terbaik untuk contoh 4: " + keuntunganTerbaik(contoh4));
    }

    public static int keuntunganTerbaik(int[] harga) {
        if (harga == null || harga.length < 2) {
            throw new IllegalArgumentException("Array harga harus memiliki setidaknya dua elemen.");
        }

        int keuntunganMaksimal = 0;
        int hargaTerendah = harga[0];

        for (int i = 1; i < harga.length; i++) {
            if (harga[i] - hargaTerendah > keuntunganMaksimal) {
                keuntunganMaksimal = harga[i] - hargaTerendah;
            }

            if (harga[i] < hargaTerendah) {
                hargaTerendah = harga[i];
            }
        }

        return keuntunganMaksimal;
    }
}

/**
 4. Buatkan fungsi untuk mengambil nilai saham dari dengan keuntungan terbaik
 Contoh :
 Input : [10,9,6,5,15]
 Output : 5
 Soal :
 1. [7,8,3,10,8]
 2. [5,12,11,12,10]
 3. [7,18,27,10,29]
 4. [20,17,15,14,10]
*/