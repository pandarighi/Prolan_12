/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4;

/**
 *
 * @author Arighi
 */
import java.util.Scanner;
public class MasukanIP {

        public static void main(String[] args){
        MasukanIP msknip = new MasukanIP();
        Scanner input = new Scanner(System.in);
        float ip, jmlIp=0, rataIP=0;
        int jmlMhs=0, jmlMhsLls=0, jmlMhsTdkLls=0;
        double rata = 0;
        
        System.out.print("Masukkan ip : ");
        ip=input.nextFloat();
        while(ip!=-999){
            if(msknip.isWithinRange(ip, 0, 4) == 1){
                jmlIp += ip;
                jmlMhs++;
                if(ip >= 2.7 && ip <= 4.0){
                        jmlMhsLls++;
                } else{
                        jmlMhsTdkLls++;
                }
            }
            System.out.print("Masukkan IP : ");
            ip=input.nextFloat();
            rata = jmlIp/jmlMhs;
        }
        
        System.out.println("Jumlah mahasiswa : "+jmlMhs);
        System.out.println("Jumlah mahasiswa lulus : "+jmlMhsLls);
        System.out.println("Jumlah mahasiswa tidak lulus : "+jmlMhsTdkLls);
        System.out.println("Rata-Rata IP : "+rata);
    }
    
    int isWithinRange(float x, int min, int max){
            if(x>=min && x<=max){
                return 1;
            } else {
                return 0;
            }
    }
}
