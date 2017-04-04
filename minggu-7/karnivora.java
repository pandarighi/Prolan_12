public class karnivora extends hewan{
    
    @Override
    public void Makan() {
       System.out.println("Pemakan daging");
       super.Makan();
    }
    
    @Override
    public void Darah(){
        System.out.println("Berdarah dingin");
        super.Darah();
                        }
    
    @Override
    public void Gigi(){
        System.out.println("Memiliki gigi taring");
        super.Gigi();
                        }
    
    karnivora (String makan) {
        super(makan);
        System.out.println(makan);
    }
    
}