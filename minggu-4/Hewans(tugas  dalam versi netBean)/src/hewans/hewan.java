/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hewans;

/**
 *
 * @author Arighi
 */
public class hewan {
	private String  nama,JenisKelamin,jenis;
	int  umur;
	
	public static void main (String[] args) {
		herbivora hrbvr = new herbivora();
		System.out.println(hrbvr.nama);
        hrbvr.JenisHewan("Jenis beruang");
        hrbvr.JenisHewan("Jenis beruang ","Berasal dari daratan China");
	}
        
}
