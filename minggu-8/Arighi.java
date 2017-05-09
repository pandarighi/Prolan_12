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