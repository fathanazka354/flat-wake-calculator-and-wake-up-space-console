package ui.luasmenu;

import core.BaseApp;
import utils.OperasiDuaDimensi;

import java.util.Scanner;

public class Persegi extends BaseApp {
    Persegi(){
        onStart();
    }
    @Override
    protected void create(Scanner scanner) {
        templateAwal();
        System.out.print("Masukkan sisi: ");
        int sisi = Integer.parseInt(scanner.nextLine());
        int result = OperasiDuaDimensi.getInstance().hitungLuasPersegi(sisi);
        templateRumus(sisi,result);

        System.out.print("ketik 0 untuk keluar");
        int keluar = Integer.parseInt(scanner.nextLine());
        if (keluar == 0){
            new LuasMenu();
        }
    }
    private void templateAwal(){
        System.out.println("----------------------------");
        System.out.println("Anda memilih Persegi");
        System.out.println("----------------------------");
        System.out.println();
    }

    private void templateRumus(int sisi, int result){
        System.out.println("=> Rumus = sisi x sisi");
        System.out.println(sisi + " x " + sisi + " = " + result);
    }
}
