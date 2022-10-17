package TugasOOP;

import java.util.Scanner;

public class main {

    private static char Pilih;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Lingkaran oLingkaran;

        int sisi1, sisi2, r;

        oLingkaran = new Lingkaran();


        System.out.println("<---------------------------------------------------->");
        System.out.println("Program Menentukan Luas dan Keliling Lingkaran");
        System.out.println("<---------------------------------------------------->");


        System.out.println("Masukkan jari -jari lingkaran: ");
        r = sc.nextInt();
        System.out.println("Luas Lingkaran : " + oLingkaran.luas(r));
        System.out.println("<---------------------------------------------------->");
        System.out.println("Keliling Lingkaran : " + oLingkaran.keliling(r));

        Pilih = sc.next().charAt(0);

    }

}






