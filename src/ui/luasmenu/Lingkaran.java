package ui.luasmenu;

import core.BaseApp;
import utils.OperasiDuaDimensi;

import java.util.Scanner;

public class Lingkaran extends BaseApp {
    Lingkaran(){
        onStart();
    }
    @Override
    protected void create(Scanner scanner) {
        templateAwal();
        System.out.print("Masukkan jari-jari: ");
        double jari_jari = Double.parseDouble(scanner.nextLine());
        double phi = 22/7;
        OperasiDuaDimensi operasiDuaDimensi = OperasiDuaDimensi.getInstance();
        double result = operasiDuaDimensi.hitungLuasLingkaran(phi, jari_jari);
        templateRumus(phi, jari_jari, result);

        System.out.print("ketik 0 untuk keluar");
        int keluar = Integer.parseInt(scanner.nextLine());
        if (keluar == 0){
            new LuasMenu();
        }
    }

    private void templateAwal(){
        System.out.println("----------------------------");
        System.out.println("Anda memilih Lingkaran");
        System.out.println("----------------------------");
        System.out.println("");
    }

    private void templateRumus(double phi,double jariJari, double result){
        System.out.println("=> Rumus = 3,14 x r x r");
        System.out.println(phi + " x " + jariJari + " x " + jariJari + " = " + result);
    }
}
