package must;

public class HitungAngkaDalamArray {

    public static void main(String[] args) {
        String[] contoh1 = {"b", "7", "h", "6", "h", "k", "i", "5", "g", "7", "8"};
        String[] contoh2 = {"7", "b", "8", "5", "6", "9", "n", "f", "y", "6", "9"};
        String[] contoh3 = {"u", "h", "b", "n", "7", "6", "5", "1", "g", "7", "9"};

        System.out.println("Jumlah angka pada contoh 1: " + hitungAngka(contoh1));
        System.out.println("Jumlah angka pada contoh 2: " + hitungAngka(contoh2));
        System.out.println("Jumlah angka pada contoh 3: " + hitungAngka(contoh3));
    }

    public static int hitungAngka(String[] array) {
        int jumlahAngka = 0;
        for (String elemen : array) {
            if (isAngka(elemen)) {
                jumlahAngka++;
            }
        }
        return jumlahAngka;
    }

    private static boolean isAngka(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

/**
 5. Buatkan fungsi untuk mengetahui ada berapa banyak angka yang terdapat pada list string array berikut
 Contoh :
 Input : [2,h,6,u,y,t,7,j,y,h,8]
 Output : 4
 Soal :
 1. [b,7,h,6,h,k,i,5,g,7,8]
 2. [7,b,8,5,6,9,n,f,y,6,9]
 3. [u,h,b,n,7,6,5,1,g,7,9]
*/