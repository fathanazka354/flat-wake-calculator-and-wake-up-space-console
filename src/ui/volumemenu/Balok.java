package ui.volumemenu;

import core.BaseApp;
import utils.OperasiTigaDimensi;

import java.util.Scanner;

public class Balok extends BaseApp {
    Balok(){
        onStart();
    }
    @Override
    protected void create(Scanner scanner) {
        templateAwal();

        System.out.print("Masukkan panjang: ");
        int panjang = Integer.parseInt(scanner.nextLine());
        System.out.print("Masukkan lebar: ");
        int lebar = Integer.parseInt(scanner.nextLine());
        System.out.print("Masukkan tinggi: ");
        int tinggi = Integer.parseInt(scanner.nextLine());

        OperasiTigaDimensi operasiTigaDimensi = OperasiTigaDimensi.getInstance();
        int result = operasiTigaDimensi.volumeBalok(panjang,lebar,tinggi);

        templateRumus(panjang, lebar, tinggi, result);

        System.out.print("ketik 0 untuk keluar");
        int keluar = Integer.parseInt(scanner.nextLine());
        if (keluar == 0){
            new VolumeMenu();
        }
    }

    private void templateAwal(){
        System.out.println("----------------------------");
        System.out.println("Anda memilih persegi panjang");
        System.out.println("----------------------------");
        System.out.println("");
    }

    private void templateRumus(int panjang, int lebar, int tinggi, int result){
        System.out.println("=> Rumus = panjang x lebar x tinggi");
        System.out.println(panjang + " x " + lebar + " x " + tinggi + " = " + result);
    }
}
