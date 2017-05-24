/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceHewan;

/**
 *
 * @author Arighi
 */
import java.util.Scanner;
public class mainHewan {

    public void cekHewan(hewan hwn){
        hwn.nama();
        hwn.jenis();
        hwn.Makan();
        hwn.Darah();
        hwn.Gigi();
    }
    public static void main(String[] args) {
        char pilih;
        Scanner scan = new Scanner(System.in);
        mainHewan mHwn = new mainHewan();
        System.out.println(" ---------------------------------------------------------------------------");
        System.out.println("| Media pembelajaran untuk pengklasifikasian dari nama dan jenis hewan.     |");
        System.out.println("| Pengklasifikasian hewan terdiri dari Herbivora, Karnivora, dan Omnivora   |");
        System.out.println("| Untuk mengetahui contoh dari pengklasifikasikan hewan,                    |");
        System.out.println("| masukan A=untuk herbivora. B=untuk karnivora. Dan C=untuk herbivora.      |");
        System.out.println(" ---------------------------------------------------------------------------");
        System.out.println("Masukan A/B/C : "); pilih=scan.next().charAt(0);
        if(pilih=='A') {
            mHwn.cekHewan(new herbivora("Panda","Vertebrata"));
        }
        if(pilih=='B') {
            mHwn.cekHewan(new karnivora("Ular","Reptil"));
        }
        if(pilih=='C') {
            mHwn.cekHewan(new omnivora("Ayam","Vertebrata"));
        }
        
        /**mHwn.cekHewan(new herbivora("Panda","Vertebrata"));
        System.out.println("----------------------------------");
        mHwn.cekHewan(new karnivora("Ular","Reptil"));
        System.out.println("----------------------------------");
        mHwn.cekHewan(new omnivora("Ayam","Vertebrata"));
        */
       }
    
}
