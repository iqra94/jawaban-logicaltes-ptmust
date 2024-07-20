package must;

public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}

/**
 2. Buatlah sebuah program yang menghasilkan 100 baris angka,
 berurutan dari 1 sampai dengan 100.
 Apabila sebuah angka habis dibagi 3, maka tampilkan kata Fizz di sebelahnya.
 Jika angkanya habis dibagi 5, tampilkan kata Buzz di sebelahnya.
 Bila angka tersebut habis dibagi 3 dan habis dibagi 5, tampilkan kata FizzBuzz di sebelah angka tersebut.
*/