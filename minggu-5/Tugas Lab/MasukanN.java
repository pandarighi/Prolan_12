import java.util.Scanner;
public class MasukanN {
    
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        MasukanN masukan = new MasukanN();
        int n,i=1,a,max=0,min=1000;
        System.out.print("Masukan N : "); n=scan.nextInt();
        char pilih;
        System.out.println("Pilihan A,untuk mencari nilai maksimum.");
        System.out.println("Pilihan B,untuk mencari nilai minimum.");
        System.out.print("masukkan pilihan A/B : "); pilih=scan.next().charAt(0);
		
                while (i<=n) {
                    System.out.print("N ke "+i+" : ");a=scan.nextInt();
                        i++;
                            if(pilih == 'A'){
                            max = masukan.pilihA(a,max);
                            }
                                else {
                                min= masukan.pilihB(a,min);
                                }
                                    
                }
        System.out.println("Jumlah N yang diinputkan  : "+n);
        if(pilih=='A'){
        System.out.println("Nilai maksimum : "+max);
        }
            else{
            System.out.println("Nilai minimum : "+min);
            }
        }
    
        int pilihA(int i, int maks ){
            if (i > maks) {
            maks=i;
            return maks;
            }
        return maks;
        }
        
        int pilihB(int i, int min){
            if(i < min){
            min=i;
            return min;
            }      
        return min;
        }

}