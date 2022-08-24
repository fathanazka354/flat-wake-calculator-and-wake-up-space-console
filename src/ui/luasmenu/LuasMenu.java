package ui.luasmenu;

import core.BaseApp;
import core.models.DuaDimensi;
import ui.firstmenu.FirstMenu;

import java.util.Scanner;

public class LuasMenu extends BaseApp {
    DuaDimensi[] arrLuas = { new DuaDimensi("Persegi"),new DuaDimensi("Lingkaran"),new DuaDimensi("Segitiga"),new DuaDimensi("Persegi Panjang")};
    public LuasMenu(){
        onStart();
    }

    @Override
    protected void create(Scanner scanner) {

        templateAwal();
        int pilihan = Integer.parseInt(scanner.nextLine());
        onStop();
        switch (pilihan){
            case 1:
                new Persegi(arrLuas[0].getName());
            case 2:
                new Lingkaran(arrLuas[1].getName());
            case 3:
                new Segitiga(arrLuas[2].getName());
            case 4:
                new PersegiPanjang(arrLuas[3].getName());
            case 0:
                new FirstMenu();
            default:
                System.out.println("pilihan tidak ada");
        }
    }
    private void templateAwal(){
        System.out.println("-----------------------------");
        System.out.println("Pilih bidang yang akan dihitung");
        System.out.println("-----------------------------");
        for (int i = 0; i < arrLuas.length; i++) {
            System.out.println( i+1 +". " + arrLuas[i].getName());
        }
        System.out.println("0. kembali ke menu sebelumnya");
        System.out.print("Masukkan pilihan bidang yang akan dihitung Luasnya: ");
    }

}
