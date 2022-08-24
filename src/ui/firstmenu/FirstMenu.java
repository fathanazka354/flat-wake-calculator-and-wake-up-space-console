package ui.firstmenu;

import core.BaseApp;
import ui.luasmenu.LuasMenu;
import ui.volumemenu.VolumeMenu;

import java.util.Scanner;

public class FirstMenu extends BaseApp {

    public FirstMenu(){
        onStart();
    }

    @Override
    protected void create(Scanner scanner) {
        templateAwal();
        int pilihan = Integer.parseInt(scanner.nextLine());
        switch (pilihan){
            case 1:
                new LuasMenu();
            case 2:
                new VolumeMenu();
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
