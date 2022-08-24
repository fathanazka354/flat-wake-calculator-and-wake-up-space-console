package ui.luasmenu;

import core.BaseApp;
import core.repository.OperasiBangunRepository;

import java.util.Scanner;

public class Lingkaran extends BaseApp {
    private String name;

    Lingkaran(){
        onStart();
    }

    public Lingkaran(String name) {
        this.name = name;
        onStart();
    }

    @Override
    protected void create(Scanner scanner) {
        templateAwal();
        System.out.print("Masukkan jari-jari: ");
        double jari_jari = Double.parseDouble(scanner.nextLine());
        double phi = 22/7;
        double result = OperasiBangunRepository.getInstance().getResultLingkaran(phi, jari_jari);
        templateRumus(phi, jari_jari, result);

        System.out.print("ketik 0 untuk keluar");
        int keluar = Integer.parseInt(scanner.nextLine());
        if (keluar == 0){
            new LuasMenu();
        }
    }

    private void templateAwal(){
        System.out.println("----------------------------");
        System.out.println("Anda memilih "+name);
        System.out.println("----------------------------");
        System.out.println("");
    }

    private void templateRumus(double phi,double jariJari, double result){
        System.out.println("=> Rumus = 3,14 x r x r");
        System.out.println(phi + " x " + jariJari + " x " + jariJari + " = " + result);
    }
}
