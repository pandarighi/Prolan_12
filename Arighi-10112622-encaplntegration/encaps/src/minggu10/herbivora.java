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
public class herbivora extends hewan {
    
    public static void main(String args[]) {
        herbivora hrbvr = new herbivora();
        hrbvr.setNama("Panda");
        hrbvr.setJenis("Vertebrata");
        
        String nama_1 = hrbvr.getNama();
        String jenis_1 = hrbvr.getJenis();    
        System.out.println("Nama  : " + nama_1 + "\tJenis : " + jenis_1 );
        hrbvr.Makan();
        hrbvr.Darah();
        hrbvr.Gigi();
    }

    herbivora () {
        
    }

    
    
    @Override
    public void Makan() {
       
       System.out.println("Pemakan tumbuhan ");
    }
    
    @Override
    public void Darah(){
        System.out.println("Berdarah panas");
                        }
    
    @Override
    public void Gigi(){
        System.out.println("Memiliki gigi graham dan gigi seri");
                        }
    
    
 
    
    
    
   
}
