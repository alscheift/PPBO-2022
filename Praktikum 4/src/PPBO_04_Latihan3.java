// Nama : Afif Nur Fauzi
// NIM  : M0521007

import java.util.InputMismatchException;
import java.util.Scanner;

public class PPBO_04_Latihan3 {
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
                
                int hasil = bil1 / bil2;
                //double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);

                System.out.println(bil1 + " / " + bil2 + " = " + hasil);
                lanjut = false;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Input salah, masukkan angka");
            }
            // Tambahkan catch statement tambahan di sini 
            catch(ArithmeticException e){
                System.out.println("Pembagian 0 tidak boleh dilakukan");
            }
            
        }

        sc.close();
    }
}

// Pembagian bilangan dengan 0 seharusnya tidak dapat dilakukan. Tambahkan catch statement
// tambahan untuk menangani pembagian dengan 0 pada source code tersebut!

/*
    Pembagian bilangan dengan 0 seharusnya tidak dapat dilakukan. 
        Tambahkan code exception handling untuk menangani pembagian dengan 0 pada source code tersebut.
        ==> catch(ArithmeticException e){
                System.out.println("Pembagian 0 tidak boleh dilakukan");
            }

    Catatan : 
    double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);
    diganti dengan int hasil = bil1 / bil2; karena pada java, tipe data double bisa melakukan pembagian dengan 0.
    sehingga apabila tidak diganti, maka tidak akan terjadi kesalahan->program tidak menangkap exception.
 */