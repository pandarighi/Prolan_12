/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstrak;

/**
 *
 * @author Arighi
 */
public class Arighi extends Mahasiswa {

    @Override
    protected void kuliah() {
        System.out.println("Kuliah lulus dengan cepat tidak mengkhawatirkan keluarga");  
    }

    @Override
    protected void lulus() {
        System.out.println("Lulus dengan ipk diatas 3.0");
    }

    @Override
    protected void tidakLulus() {
        System.out.println("Tidak lulus jika kuliah lebih dari 7 tahun");
    }
    
}
