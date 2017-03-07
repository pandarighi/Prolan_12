public class hewan {
	private String  nama,JenisKelamin,jenis;
			int  umur;
	
	private void makan () {
		System.out.println ("Makan untuk hidup");
	}
	
	public static void main (String[] args) {
		karnivora komodo = new karnivora();

		komodo.jenis = "Reptil";
        komodo.MakanDaging();
	}
}
