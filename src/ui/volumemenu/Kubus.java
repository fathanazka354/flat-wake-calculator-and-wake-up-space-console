package ui.volumemenu;

import core.BaseApp;
import core.models.TigaDimensi;
import utils.OperasiTigaDimensi;

import java.util.Arrays;
import java.util.Scanner;

public class Kubus extends BaseApp {
    int pilihan;
    Kubus(int pilihan){
        this.pilihan = pilihan;
        onStart();
    }
    @Override
    protected void create(Scanner scanner) {
        templateAwal();
        System.out.print("Masukkan sisi: ");
        int sisi = Integer.parseInt(scanner.nextLine());
        OperasiTigaDimensi operasiTigaDimensi = OperasiTigaDimensi.getInstance();
        int result = operasiTigaDimensi.volumeKubus(sisi);
        templateRumus(sisi, result);
        System.out.print("ketik 0 untuk keluar");
        int keluar = Integer.parseInt(scanner.nextLine());

        if (keluar == 0){
            new VolumeMenu();
        }

    }

    private void templateAwal(){
        System.out.println("----------------------------");
        System.out.println("Anda memilih Kubus"+ Arrays.toString(new TigaDimensi[pilihan]));
        System.out.println("----------------------------");
        System.out.println();
    }

    private void templateRumus(int sisi, int result){
        System.out.println("=> Rumus = sisi x sisi x sisi");
        System.out.println(sisi + " x " + sisi + " x " + sisi + " = " + result);
    }
}
