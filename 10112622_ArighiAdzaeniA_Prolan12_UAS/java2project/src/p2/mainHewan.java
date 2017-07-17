/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

/**
 *
 * @author Arighi
 */
import java.util.Scanner;
import p1.herbivora;
import p1.karnivora;
import p1.omnivora;
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
        generic<String> ver = new  generic<>();
        ver.setDesc("\n(Vertebrata adalah subfilum dari Chordata, mencakup semua hewan yang memiliki tulang belakang.)");
        String v = ver.getDesc();
        generic<String> rep = new  generic<>();
        rep.setDesc("\n(Reptil adalah sebuah kelompok hewan yang berdarah dingin dan memiliki sisik yang menutupi tubuhnya.)");
        String r = rep.getDesc();
        System.out.println(" ---------------------------------------------------------------------------");
        System.out.println("| Media pembelajaran untuk pengklasifikasian dari nama dan jenis hewan.     |");
        System.out.println("| Pengklasifikasian hewan terdiri dari Herbivora, Karnivora, dan Omnivora   |");
        System.out.println("| Untuk mengetahui contoh dari pengklasifikasikan hewan,                    |");
        System.out.println("| masukan A=untuk herbivora. B=untuk karnivora. Dan C=untuk herbivora.      |");
        System.out.println(" ---------------------------------------------------------------------------");
        System.out.println("Masukan A/B/C : "); pilih=scan.next().charAt(0);
        if(pilih=='A') {
            mHwn.cekHewan(new herbivora("Panda","Vertebrata"+v));
            
        }
        if(pilih=='B') {
            mHwn.cekHewan(new karnivora("Ular","Reptil"+r));
        }
        if(pilih=='C') {
            mHwn.cekHewan(new omnivora("Ayam","Vertebrata"+v));
        }
        
       }
    
}