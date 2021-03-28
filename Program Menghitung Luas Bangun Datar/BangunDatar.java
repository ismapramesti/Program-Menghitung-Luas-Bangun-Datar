package LuasBangunDatar;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Nama : Luh De Isma Pramesti
 * NIM  : 2005551011 
 */

public class BangunDatar {
  BangunDatar (){
  //konstruktor default	
}
//method hitung dari kelas induk
public void hitung (){
    BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
    double l=0, s=0;
    try {
	System.out.println ("Masukkan nilai sisi :");
	s = Integer.parseInt(bfr.readLine());	
    }
    catch (Exception e) {
    // TODO: handle exception
    }
    l = s*s;
    System.out.println ("Luas  = " +l);
}
}  


