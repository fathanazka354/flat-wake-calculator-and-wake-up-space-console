package ui.luasmenu;

import core.BaseApp;
import core.repository.OperasiBangunRepository;
import java.util.Scanner;

public class PersegiPanjang extends BaseApp {
    private String name;

    PersegiPanjang(){
        onStart();
    }

    public PersegiPanjang(String name) {
        this.name = name;
        onStart();
    }

    @Override
    protected void create(Scanner scanner) {
        templateAwal();
        System.out.print("Masukkan Panjang: ");
        int panjang = Integer.parseInt(scanner.nextLine());

        System.out.print("Masukkan Lebar: ");
        int lebar = Integer.parseInt(scanner.nextLine());
        int result = OperasiBangunRepository.getInstance().getResultPersegiPanjang(panjang,lebar);
        templateRumus(panjang,lebar,result);
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
        System.out.println();
    }

    private void templateRumus(int panjang, int lebar, int result){
        System.out.println("=> Rumus = panjang x lebar");
        System.out.println(panjang + " x " + lebar + " = " + result);
    }
}
