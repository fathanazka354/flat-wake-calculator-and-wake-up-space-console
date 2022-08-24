package core.repository;

public class OperasiBangunRepository {
    private volatile static OperasiBangunRepository INSTANCE = null;

    public static OperasiBangunRepository getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new OperasiBangunRepository();
        }
        return INSTANCE;
    }

    public double getResultLingkaran(double phi, double jariJari){
        return phi * jariJari * jariJari;
    }

    public int getResultSegitiga(int alas, int tinggi){
        return (int) (0.5 * alas * tinggi);
    }

    public int getResultPersegi(int sisi){
        return sisi * sisi;
    }

    public int getResultPersegiPanjang(int panjang, int lebar){
        return panjang * lebar;
    }

    public int getResultKubus(int sisi){
        return (int) Math.pow(sisi,3);
    }

    public double getResultTabung(double phi, double jariJari, int tinggi){
        return phi * Math.pow(jariJari,2) * tinggi;
    }

    public int getResultBalok(int panjang, int lebar, int tinggi){
        return panjang * lebar * tinggi;
    }
}
