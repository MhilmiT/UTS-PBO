import java.util.Scanner;

public class nomor3 {

    static void ngitung(int a,int b){
        Scanner leng = new Scanner(System.in);
        for (int j=1;j<=10;j++){
            System.out.print(j+". "); a=leng.nextInt();
            b+=a;
        }
        System.out.println("Hasil dari pertambahan tersebut : "+b);

    }
    public static void main(String[] args) {
        int angka=0,sum=0;
        System.out.println("Masukan 10 angka sembarang :");
        ngitung(angka,sum);

    }

}

