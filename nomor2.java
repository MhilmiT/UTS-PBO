import java.util.Scanner;

public class nomor2 {
    public static double bb, tb;
    public static double BMI;

    public static double BMI() {
        return BMI = bb / (tb/100 * tb /100);
    }

    public static void main(String[] args) {
        Scanner leng = new Scanner((System.in));

        System.out.println("========================================");
        System.out.println("\t\t\tSelamat Datang");
        System.out.println("\t\t\t\t Di");
        System.out.println(" Program Menentukan Body Mass Index");
        System.out.println("========================================");

        System.out.println(" ");

        System.out.println("Masukkan Berat Badan Anda : ");
        bb = leng.nextDouble();

        System.out.println("Masukkan Tinggi Anda: ");
        tb = leng.nextDouble();

        BMI = BMI();

        System.out.println();
        if (BMI >= 18.5 && BMI <= 22.9) {
            System.out.println("Berat Badan Anda : Ideal");
        } else if (BMI >= 22.9) {
            System.out.println("Berat Badan Anda: Overweight");
        } else if (BMI <= 18.5) {
            System.out.println("Berat Badan Anda: Underweight");
        }

    }
}
