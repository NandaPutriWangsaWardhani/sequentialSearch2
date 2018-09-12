package sequentialsearch2;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class SequentialSearch2 {

    public static void main(String[] args) {
        int data[] = new int[6];
        int i, angka, cari;
        boolean ketemu;

        for (i = 0; i < data.length; i++) {
            angka = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Angka ke-" + (i + 1)));
            data[i] = angka;
        }
        System.out.print("Angka Dimasukkan = { ");
        for (i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("}");
        cari = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Angka yang ingin dicari : "));
        System.out.println("Angka Dicari: " + cari);
        ketemu = false;
        for (i = 0; i < data.length; i++){
        if (data[i] == cari) {
            ketemu = true;
            break;
        }
    }
    if(ketemu){
        
        System.out.println("Angka ditemukan dalam urutan ke - " + (i + 1));
    } else {
    System.out.println("Angka tidak ditemukan");
    }
}
}
