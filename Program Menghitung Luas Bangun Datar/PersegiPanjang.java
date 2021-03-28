package LuasBangunDatar;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Nama : Luh De Isma Pramesti
 * NIM  : 2005551011 
 */

public class PersegiPanjang extends BangunDatar {
    public void hitung (){
    BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
    double p=0, l=0, le=0;
    System.out.println ("\n=========== Menghitung Luas Persegi Panjang ==============");
    try {
	System.out.println ("Masukkan nilai Panjang :");
        p = Integer.parseInt(bfr.readLine());
        System.out.println ("Masukkan nilai Lebar :");
        le = Integer.parseInt(bfr.readLine());				
    }
    catch (Exception e) {
    // TODO: handle exception
    }
    l = p*le;
    System.out.println ("Luas Persegi Panjang = " +l);						
    }	
}