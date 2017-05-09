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
public abstract class Mahasiswa {
    protected String nama;
    protected String nim;
    
    protected abstract void kuliah();
    protected abstract void lulus();
    protected abstract void tidakLulus();
    
}
