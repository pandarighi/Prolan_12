public class herbivora extends hewan  {

   
    
    @Override
    public void Makan() {
       System.out.println("Pemakan tumbuhan");
       super.Makan();
    }
    
    @Override
    public void Darah(){
        System.out.println("Berdarah panas");
        super.Darah();
                        }
    
    @Override
    public void Gigi(){
        System.out.println("Memiliki gigi graham dan gigi seri");
        super.Gigi();
                        }
    
    herbivora (String makan) {
        super(makan);
        System.out.println(makan);
    }
    
   
}