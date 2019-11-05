/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan60.akatsuki;

/**
 *
 * @author
 * NAMA     : Yazid Fadlullah At-Taukily
 * KELAS    : PBO11K
 * NIM      : 10118907
 * Deskripsi Program : Latihan menampilkan tim akatsuki
 * 
 */
public class PBO11K10118907Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Akatsuki a = new Akatsuki();
        KetuaAsli b = new KetuaAsli();
        
        System.out.println("Ketua Palsu : "+a.ketua());
        System.out.println("Ketua Asli : "+b.ketua());
    }
    
}
