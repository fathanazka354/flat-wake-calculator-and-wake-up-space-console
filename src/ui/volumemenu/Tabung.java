package ui.volumemenu;

import core.BaseApp;
import utils.OperasiTigaDimensi;

import java.util.Scanner;

public class Tabung extends BaseApp {
    Tabung(){
        onStart();
    }
    @Override
    protected void create(Scanner scanner) {
        templateAwal();
        System.out.print("Masukkan jari-jari: ");
        double jariJari = Double.parseDouble(scanner.nextLine());
        System.out.print("Masukkan tinggi: ");
        int tinggi = Integer.parseInt(scanner.nextLine());
        OperasiTigaDimensi operasiTigaDimensi = OperasiTigaDimensi.getInstance();
        double phi = 22/7;
        double result  = operasiTigaDimensi.volumeTabung(phi,jariJari,tinggi);
        templateRumus(phi,jariJari,tinggi,result);
        System.out.print("ketik 0 untuk keluar");
        int keluar = Integer.parseInt(scanner.nextLine());

        if (keluar == 0){
            new VolumeMenu();
        }
    }
    private void templateAwal(){
        System.out.println("----------------------------");
        System.out.println("Anda memilih Tabung");
        System.out.println("----------------------------");
        System.out.println();
    }

    private void templateRumus(double phi, double jariJari, int tinggi, double result){
        System.out.println("=> Rumus = 3.14 atau 22/7 x jari-jari x jari-jari x tinggi");
        System.out.println(phi + " x " + jariJari + " x " + jariJari + " x " + tinggi + " = " + result);
    }
}
