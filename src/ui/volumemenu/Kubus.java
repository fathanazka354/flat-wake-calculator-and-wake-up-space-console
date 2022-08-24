package ui.volumemenu;

import core.BaseApp;
import core.models.TigaDimensi;
import core.repository.OperasiBangunRepository;

import java.util.Arrays;
import java.util.Scanner;

public class Kubus extends BaseApp {
    String name;
    Kubus(){
        onStart();
    }

    public Kubus(String name) {
        this.name = name;
        onStart();
    }

    @Override
    protected void create(Scanner scanner) {
        templateAwal();
        System.out.print("Masukkan sisi: ");
        int sisi = Integer.parseInt(scanner.nextLine());
        int result = OperasiBangunRepository.getInstance().getResultKubus(sisi);
        templateRumus(sisi, result);
        System.out.print("ketik 0 untuk keluar");
        int keluar = Integer.parseInt(scanner.nextLine());

        if (keluar == 0){
            new VolumeMenu();
        }

    }

    private void templateAwal(){
        System.out.println("----------------------------");
        System.out.println("Anda memilih "+ name);
        System.out.println("----------------------------");
        System.out.println();
    }

    private void templateRumus(int sisi, int result){
        System.out.println("=> Rumus = sisi x sisi x sisi");
        System.out.println(sisi + " x " + sisi + " x " + sisi + " = " + result);
    }
}
