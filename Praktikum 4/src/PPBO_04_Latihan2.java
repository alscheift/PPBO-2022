// Nama : Afif Nur Fauzi
// NIM  : M0521007

import java.util.InputMismatchException;
import java.util.Scanner;

public class PPBO_04_Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bil1, bil2;
        boolean lanjut = true;
        while (lanjut) {
            try {
                System.out.print("Ketik bilangan pertama : ");
                bil1 = sc.nextInt();
                System.out.print("Ketik bilangan kedua : ");
                bil2 = sc.nextInt();
                double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);

                System.out.println(bil1 + " / " + bil2 + " = " + hasil);
                lanjut = false;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Input salah, masukkan angka");
            }
        }

        sc.close();
    }
}

// Ketik huruf untuk digunakan sebagai input bilangan pertama kemudian klik ENTER. 
// Jelaskan perbedaannya dengan source code sebelumnya (Latihan1)!


/* Jawab :
    Ketik huruf untuk digunakan sebagai input bilangan pertama kemudian klik ENTER. 
        Jelaskan perbedaannya dengan ExceptionDemo1.java!
        == >
            Pada source code ini, program akan menangkap Exception lalu mengulang kembali kode yang ada di dalam try {...}, jadi program tetap dapat berjalan karena ada yang menangani Exception. 
            Sedangkan pada source code sebelumnya, akan terjadi error pada program karena InputMismatch. Error ini (InputMismatch) tidak terhandle dengan exception, sehingga program berhenti berjalan.
    
 */
