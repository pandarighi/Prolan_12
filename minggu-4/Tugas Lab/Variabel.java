public class Variabel {
private int a; //usahakan private agar tak diakses sembarang
private boolean menikah; //usahakan private agar tak diakses sembarang
private char _nama; //usahakan private agar tak diakses sembarang
public static final String JUDUL = "Belajar Java Yuks"; //variabel static dan konstanta
public static String judul2 = "Belajar Java Yuks";

public static void main (String[] args) {
Variabel var = new Variabel();
final int a = 12;

var.a = 1; //instance
//a = 11, tak bisa diubah
double aa, b, c;
String nama= "Arighi";
byte bb = 1, B = 2;
System.out.println(JUDUL);
System.out.println(judul2);
}
 public void tesVariabel() {
 System.out.println(a);
  System.out.println(menikah);
   System.out.println(JUDUL);
    System.out.println(judul2);
	}
	}
	
	class AksesVariabelStatic {
	public void AksesVariabelStatic(){
	 System.out.println(Variabel.JUDUL);
	 //Variabel.JUDUL = "BELAJAR HAL LAIN " tak bisa di akses
	 }
	 }