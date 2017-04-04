public class hewan {
    String  makan,nama,jenis,JenisKelamin = "Jantan";
    int  umur;

    
    
    public void Makan(){
        System.out.println("Hewan makan untuk kelangsungan hidup");
                        }
    
    public void Darah(){
        System.out.println("Jenis darah pada hewan ada dua");
                        }
    
    public void Gigi(){
        System.out.println("Memiliki jenis gigi sesuai kebutuhan memakan makanan");
                        }
    
    hewan(String makan) {
        this.makan = makan;
    }
}