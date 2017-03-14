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
