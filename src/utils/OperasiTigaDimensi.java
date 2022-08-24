package utils;

public class OperasiTigaDimensi implements IOperasiTigaDimensi {
    private static OperasiTigaDimensi instance = null;

    public static OperasiTigaDimensi getInstance(){
        if (instance == null){
            instance = new OperasiTigaDimensi();
        }
        return instance;
    }
    @Override
    public int volumeKubus(double sisi) {
        return (int) Math.pow(sisi,3);
    }

    @Override
    public int volumeBalok(int panjang, int lebar, int tinggi) {
        return panjang * lebar * tinggi;
    }

    @Override
    public double volumeTabung(double phi, double jariJari, int tinggi) {
        return phi * Math.pow(jariJari,2) * tinggi;
    }
}
