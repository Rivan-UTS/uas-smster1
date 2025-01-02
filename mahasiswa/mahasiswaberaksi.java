/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author My PC
 */
public class mahasiswaberaksi {
    public static void main(String[] args){
        mahasiswa mahasiswaku = new mahasiswa ();
        mahasiswaku.membaca = "tolongdibaca";
        mahasiswaku.nyontek = "dilarangnyontek";
        mahasiswaku.modifikasi = "tolongdimodifikasi";
      
        System.out.println("membaca: " + mahasiswaku.membaca);
        System.out.println("nyontek: " + mahasiswaku.nyontek);
        System.out.println("modifikasi: " + mahasiswaku.modifikasi);
    }
}
