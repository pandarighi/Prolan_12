/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu10;

/**
 *
 * @author Arighi
 */
public class hewan {
    public String  nama,jenis;

    hewan() {
        
    }
    
    public hewan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    
    
    public void Makan(){
        System.out.println("Hewan makan untuk kelangsungan hidup");
                        }
    
    public void Darah(){
        System.out.println("Jenis darah pada hewan ada dua");
                        }
    
    public void Gigi(){
        System.out.println("Memiliki jenis gigi sesuai kebutuhan memakan makanan");
                        }
    
    
}

