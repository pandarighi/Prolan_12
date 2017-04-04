public class omnivora extends hewan{
    
    @Override
    public void Makan() {
       System.out.println("Pemakan tumbuhan & daging");
       super.Makan();
    }
    
    @Override
    public void Darah(){
        System.out.println("Berdarah panas/dingin");
        super.Darah();
                        }
    
    @Override
    public void Gigi(){
        System.out.println("Memiliki gigi graham dan gigi seri/gigi taring");
        super.Gigi();
                        }
    
    omnivora (String makan) {
        super(makan);
        System.out.println(makan);
    }
    
}