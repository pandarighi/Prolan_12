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
public class herbivora extends hewan implements makhlukHidup {
    private String nama, jenis;
    public herbivora(String nama, String jenis){
        this.nama = nama;
        this.jenis = jenis;
    }
    
    @Override
        public void nama(){
        System.out.println("Nama hewan :  "+nama);
    }

    
    @Override
        public void jenis() {
        System.out.println("Jenis hewan :  "+jenis);
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
