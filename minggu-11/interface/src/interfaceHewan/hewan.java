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
public abstract class hewan implements makhlukHidup {

    public abstract void nama();
    public abstract void jenis();
    
    @Override
    public void Makan() {
        System.out.println("Hewan makan untuk kelangsungan hidup");
    }

    @Override
    public void Darah() {
        System.out.println("Jenis darah pada hewan ada dua");
    }

    @Override
    public void Gigi() {
        System.out.println("Memiliki jenis gigi sesuai kebutuhan memakan makanan");
    }
    
}
