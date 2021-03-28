package LuasBangunDatar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Nama : Luh De Isma Pramesti
 * NIM  : 2005551011 
 */

public class Main {
    public static void main(String[] args) {
	LuasLingkaran luasLingkaran = new LuasLingkaran(); // membuat object baru
	PersegiPanjang persegiPanjang = new PersegiPanjang();
	Persegi persegi = new Persegi();
	Penghitung penghitung = new Penghitung();
	int pil = 0;
	BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
	while (pil!= 4){
	System.out.println("\n \n ========================= MENU ===========================");
	System.out.println("1.Luas Lingkaran ");
	System.out.println("2.Persegi Panjang ");
	System.out.println("3.Persegi");
        System.out.println("4.Exit");
	System.out.println("Pilihan 1-4 : ");

	try {
            pil = Integer.parseInt(bfr.readLine());
            if (pil == 1){
		penghitung.setBangundatar(luasLingkaran);
		penghitung.mengitung();
		/* pollimorfism , yang membedakan di "penghitung.setBangundatar(luasLingkaran);"
		dengan parameter (luasLingkaran) sesuai pembentukan objek baru diatas*/
            }
            else if (pil == 2){
		penghitung.setBangundatar(persegiPanjang);
		penghitung.mengitung(); // pollimorfism
            }
            else if (pil == 3){
		System.out.println ("\n=============== Menghitung Luas Persegi ==================");
		penghitung.setBangundatar(persegi);
		penghitung.mengitung(); // pollimorfism
            }
            /*Ketika dijalankan opsi No 3 . Tentu program akan memproses menghitung luas persegi
            * padahal di class Persegi sendiri, tidak ada deklarasi apapun.
            * inilah yang dimaksud dengan inheritance , 
            * bahwa class persegi diwarisi dari sifat kelas induk BangunDatar
            */
            else if (pil == 4){
		System.out.println ("\n==================== Terima Kasih =======================");
            }
            else {
		System.out.println (" Opsi yang Anda Masukkan Salah! ");	
            }
        } 
        catch (NumberFormatException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
        catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
        }	
	}
    }
}
