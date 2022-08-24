package ui.luasmenu;

import core.BaseApp;
import utils.OperasiDuaDimensi;

import java.util.Scanner;

public class Segitiga extends BaseApp {
    Segitiga(){
        onStart();
    }
    @Override
    protected void create(Scanner scanner) {
        templateAwal();
        System.out.print("Masukkan alas: ");
        int alas = Integer.parseInt(scanner.nextLine());

        System.out.print("Masukkan tinggi: ");
        int tinggi = Integer.parseInt(scanner.nextLine());
        int result = OperasiDuaDimensi.getInstance().hitungLuasSegitiga(alas,tinggi);
        templateRumus(alas,tinggi,result);
        System.out.print("ketik 0 untuk keluar");
        int keluar = Integer.parseInt(scanner.nextLine());
        if (keluar == 0){
            new LuasMenu();
        }
    }
    private void templateAwal(){
        System.out.println("----------------------------");
        System.out.println("Anda memilih Segitiga");
        System.out.println("----------------------------");
        System.out.println();
    }

    private void templateRumus(int alas, int tinggi, int result){
        System.out.println("=> Rumus = 1/2 x alas x tinggi");
        System.out.println("1/2 " + " x " + alas + " x " + tinggi + " = " + result);
    }
}
