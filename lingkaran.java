package Nomor1;

public class lingkaran implements bangundatar {

    private double phi = 3.1415;

    lingkaran(){

    }

    @Override
    public  double luas (int sisi1, int sisi2){
        return 0;
    }

    @Override
    public double keliling(int sisi1, int sisi2){
        return 0;
    }

    public double luas(int r){
        return ( phi * r * r);
    }

    public double keliling(int r){
        return (2 * phi * r);
    }
}



