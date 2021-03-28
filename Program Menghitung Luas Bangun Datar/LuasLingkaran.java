package LuasBangunDatar;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Nama : Luh De Isma Pramesti
 * NIM  : 2005551011 
 */

//extends adalah keyword inheritance
public class LuasLingkaran extends BangunDatar {
    public void hitung (){
    BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
    double r=0, l=0;
    
    System.out.println ("\n=========== Menghitung Luas lingkaran ==============");
    try {
	System.out.println ("Masukkan nilai r (jari-jari): ");
        r = Integer.parseInt(bfr.readLine());			
    } 
    catch (Exception e) {
    // TODO: handle exception
    }
    l = 3.14*r*r;
    System.out.println ("Luas Lingkaran = " +l);				
    }		
}
