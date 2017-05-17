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
public class omnivora extends hewan{
    public static void main(String args[]) {
        omnivora omni = new omnivora();
        omni.setNama("Ayam");
        omni.setJenis("Vertebrata");
        
        String nama_3 = omni.getNama();
        String jenis_3 = omni.getJenis();    
        System.out.println("Nama  : " + nama_3 + "\tJenis : " + jenis_3 );
        omni.Makan();
        omni.Darah();
        omni.Gigi();
    }
    
    @Override
    public void Makan() {
       System.out.println("Pemakan tumbuhan & daging");
       super.Makan();
    }
    
    @Override
    public void Darah(){
        System.out.println("Berdarah panas/dingin");
        super.Darah();
                        }
    
    @Override
    public void Gigi(){
        System.out.println("Memiliki gigi graham dan gigi seri/gigi taring");
        super.Gigi();
                        }
    
    
    
}

