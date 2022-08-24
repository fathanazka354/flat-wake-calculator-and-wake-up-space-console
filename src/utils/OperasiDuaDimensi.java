package utils;

public class OperasiDuaDimensi implements IOperasiDuaDimensi{
    private static OperasiDuaDimensi instance = null;
    public static OperasiDuaDimensi getInstance(){
        if (instance == null){
            instance = new OperasiDuaDimensi();
        }
        return instance;
    }
    @Override
    public int hitungLuasPersegi(int sisi) {
        return sisi * sisi;
    }

    @Override
    public int hitungLuasPersegiPanjang(int panjang, int lebar) {
        return panjang * lebar;
    }

    @Override
    public double hitungLuasLingkaran(double phi, double jariJari) {
        return phi * jariJari * jariJari;
    }

    @Override
    public int hitungLuasSegitiga(int alas, int tinggi) {
        return (int) (0.5 * alas * tinggi);
    }
}
