package Nomor1;

import java.util.Scanner;
public class MAIN {

        private static char Pilih;
        private static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            lingkaran oLingkaran;

            int sisi1, sisi2, r;

            oLingkaran = new lingkaran();


            System.out.println("<---------------------------------------------------->");
            System.out.println("Program Menentukan Keliling Lingkaran");
            System.out.println("<---------------------------------------------------->");
                
            System.out.println(" ");


            System.out.println("Masukkan jari -jari lingkaran: ");
            r = sc.nextInt();
            System.out.println("Luas Lingkaran : " + oLingkaran.luas(r));
            System.out.println("<---------------------------------------------------->");
            System.out.println("Keliling Lingkaran : " + oLingkaran.keliling(r));

            Pilih = sc.next().charAt(0);

        }

    }


