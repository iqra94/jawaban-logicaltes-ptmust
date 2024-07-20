package must;

public class KalimatTerbalik {

    public static void main(String[] args) {
        String[] kalimatArray = {
                "italem irad irigayaj",
                "iadab itsap ulalreb",
                "nalub kusutret gnalali"
        };

        for (String kalimat : kalimatArray) {
            System.out.println(ubahKalimat(kalimat));
        }
    }

    public static String ubahKalimat(String kalimat) {
        String[] kataArray = kalimat.split(" ");
        StringBuilder kalimatBaru = new StringBuilder();

        for (String kata : kataArray) {
            kalimatBaru.append(new StringBuilder(kata).reverse().toString()).append(" ");
        }

        // Menghapus spasi terakhir
        return kalimatBaru.toString().trim();
    }
}

/**
 1. Buat sebuah fungsi untuk mengubah kalimat berikut menjadi kalimat yang mudah terbaca:
 italem irad irigayaj
 iadab itsap ulalreb
 nalub kusutret gnalali
*/