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
public class karnivora extends hewan{
    public static void main(String args[]) {
        karnivora krnvr = new karnivora();
        krnvr.setNama("Ular");
        krnvr.setJenis("Reptil");
        
        String nama_2 = krnvr.getNama();
        String jenis_2 = krnvr.getJenis();    
        System.out.println("Nama  : " + nama_2 + "\tJenis : " + jenis_2 );
        krnvr.Makan();
        krnvr.Darah();
        krnvr.Gigi();
    }
    
    @Override
    public void Makan() {
       System.out.println("Pemakan daging");
       super.Makan();
    }
    
    @Override
    public void Darah(){
        System.out.println("Berdarah dingin");
        super.Darah();
                        }
    
    @Override
    public void Gigi(){
        System.out.println("Memiliki gigi taring");
        super.Gigi();
                        }
    
    
    
}

