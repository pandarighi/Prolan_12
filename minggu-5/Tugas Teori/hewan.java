public class hewan extends herbivora {
    
    @Override
    public void Sifat(){
        System.out.println("Makan untuk kelangsungan hidup");
                        }
    
    public hewan(String nama) {
        super(nama);
    }
    
    public void Herbivora() {
        System.out.println("Jenis kelamin : "
                + super.JenisKelamin);
        super.Sifat();
        Sifat();
                             }
    
     public static void main(String argd[]) {
        hewan nm = new hewan("Panda");
        nm.NamaHewan();
        hewan jns = new hewan("Panda");
        jns.Herbivora();
        
        
    }    

}