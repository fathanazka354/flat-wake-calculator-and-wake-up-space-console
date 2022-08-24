package ui.firstmenu;

import core.BaseApp;
import core.models.DuaDimensi;
import core.models.TigaDimensi;
import ui.luasmenu.LuasMenu;
import ui.volumemenu.VolumeMenu;

import java.util.Scanner;

public class FirstMenu extends BaseApp {

    TigaDimensi[] arrVolume = {new TigaDimensi("Kubus"),new TigaDimensi("Balok"),new TigaDimensi("Tabung")};
    DuaDimensi[] arrLuas = { new DuaDimensi("Persegi"),new DuaDimensi("Lingkaran"),new DuaDimensi("Segitiga"),new DuaDimensi("Persegi Panjang")};
    public FirstMenu(){
        onStart();
    }

    @Override
    protected void create(Scanner scanner) {
        templateAwal();
        Integer pilihan = Integer.valueOf(scanner.next());
        switch (pilihan){
            case 1:
                new LuasMenu(arrLuas);
            case 2:
                new VolumeMenu(arrVolume);
            case 3:
                onDestroy();
            default:
                System.out.println("Pilihan tidak ada!");
        }
    }


    private void templateAwal(){
        System.out.println("-----------------------------");
        System.out.println("Kalkulator Penghitung Luas dan Volume");
        System.out.println("-----------------------------");
        System.out.println("Menu");
        System.out.println("1. Hitung Luas Bidang");
        System.out.println("2. Hitung Volum");
        System.out.println("3. Tutup Aplikasi");
        System.out.print("pilih menu diatas: ");
    }
}
