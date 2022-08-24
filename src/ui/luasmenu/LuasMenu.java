package ui.luasmenu;

import core.BaseApp;
import core.models.DuaDimensi;

import java.util.Scanner;

public class LuasMenu extends BaseApp {
    DuaDimensi[] arrLuas;
    public LuasMenu(){
        onStart();
    }

    public LuasMenu(DuaDimensi[] arrLuas) {
        this.arrLuas = arrLuas;
    }

    @Override
    protected void create(Scanner scanner) {

        templateAwal();
        int pilihan = Integer.parseInt(scanner.nextLine());
        onStop();
        switch (pilihan){
            case 1:
                new Persegi();
            case 2:
                new Lingkaran();
            case 3:
                new Segitiga();
            case 4:
                new PersegiPanjang();
            default:
                System.out.println("pilihan tidak ada");
        }
    }
    private void templateAwal(){

//        DuaDimensi[] arr = { new DuaDimensi("Persegi"),new DuaDimensi("Lingkaran"),new DuaDimensi("Segitiga"),new DuaDimensi("Persegi Panjang")};

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
