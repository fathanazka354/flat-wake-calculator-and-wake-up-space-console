package ui.volumemenu;

import core.BaseApp;
import core.models.TigaDimensi;
import ui.firstmenu.FirstMenu;

import java.util.Scanner;

public class VolumeMenu extends BaseApp {
    TigaDimensi[] arrVolume;
    public VolumeMenu() {
        onStart();
    }

    public VolumeMenu(TigaDimensi[] arr) {
        this.arrVolume = arr;
        onStart();
    }

    @Override
    protected void create(Scanner scanner) {
        templateAwal();
        int pilihan = Integer.parseInt(scanner.next());
        switch (pilihan){
            case 0:
                new FirstMenu();
            case 1:
                new Kubus(pilihan);
            case 2:
                new Balok();
            case 3:
                new Tabung();
            default:
                System.out.println("pilihan tidak ada");
        }
    }

    private void templateAwal() {
//        TigaDimensi[] arr = {new TigaDimensi("Kubus"),new TigaDimensi("Balok"),new TigaDimensi("Tabung"),};
        System.out.println("-----------------------------");
        System.out.println("Pilih bidang yang akan dihitung");
        System.out.println("-----------------------------");
        for (int i = 0; i<arrVolume.length;i++){
            System.out.println(i + 1 + ". " + arrVolume[i].getName());
        }
        System.out.println("0. kembali ke menu sebelumnya");
        System.out.print("Masukkan pilihan bidang yang akan dihitung Volumenya: ");
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
