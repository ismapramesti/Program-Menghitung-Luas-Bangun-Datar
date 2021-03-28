package LuasBangunDatar;

/**
 * Nama : Luh De Isma Pramesti
 * NIM  : 2005551011 
 */

public class Penghitung {
   
/*membuat objek private
* sehingga tidak dapat diakses dari kelas lain 
* inilah yang di sebut enkapsulasi
*/
private BangunDatar  bangunDatar ; 

/* agar bisa diakses oleh kelas lain 
* maka dibuatlah method atau fungsi setter getter di bawah ini*/
public BangunDatar getBangundatar() {
    return bangunDatar;
    }
    public void setBangundatar(BangunDatar bangundatar) {
    this.bangunDatar = bangundatar;
    }
    public void mengitung (){
    bangunDatar.hitung();//memanggil method atau fungsi hitung
    }
}
