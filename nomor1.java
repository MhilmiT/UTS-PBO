import java.util.Scanner;
public class nomor1 {
    static int totalJam(int jam, int jamAkhir) {return Math.abs(jamAkhir - jam);}
    static int totalMenit(int menit, int menitAkhir) {return Math.abs(menitAkhir - menit);}
    static int totalDetik(int detik,int detikAkhir) {return Math.abs(detikAkhir - detik);}
    static double harga(int jam,int menit,int detik) {
        return ((3600 * jam + 60 * menit + detik) / 5)*150;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jam Awal");
        System.out.print("Jam Awal = ");
        int jam = sc.nextInt();
        System.out.print("Menit Awal= ");
        int menit = sc.nextInt();
        System.out.print("Detik = ");
        int detik = sc.nextInt();

        System.out.println("");

        System.out.println("Masukkan jam Akhir");
        System.out.print("Jam akhir= ");
        int jamAkhir = sc.nextInt();
        System.out.print("Menit akhir = ");
        int menitAkhir = sc.nextInt();
        System.out.print("Detik akhir= ");
        int detikAkhir = sc.nextInt();
        nomor1 waktu = new nomor1();

        System.out.println("========================================================");
        System.out.println("Waktu awal percakapan = (" +jam + ":" + menit + ":" + detik + ")");
        System.out.println("Waktu akhir percakapan = (" + jamAkhir + ":" + menitAkhir + ":" +  detikAkhir + ")");
        System.out.println("Waktu total percakapan = " + totalJam(jam,jamAkhir)+":"+totalMenit(menit,menitAkhir)+":"+totalDetik(detik,detikAkhir));
        System.out.println("Biaya yang dikenakan sebesar = Rp." + harga(jam,menit,detik));
    }
}



