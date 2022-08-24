package ui.volumemenu;

import core.BaseApp;
import core.models.TigaDimensi;
import ui.firstmenu.FirstMenu;

import java.util.Scanner;

public class VolumeMenu extends BaseApp {
    TigaDimensi[] arrVolume = {new TigaDimensi("Kubus"),new TigaDimensi("Balok"),new TigaDimensi("Tabung")};
    public VolumeMenu() {
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
                new Kubus(arrVolume[0].getName());
            case 2:
                new Balok(arrVolume[1].getName());
            case 3:
                new Tabung(arrVolume[2].getName());
            default:
                System.out.println("pilihan tidak ada");
        }
    }

    private void templateAwal() {
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
