/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author My PC
 */
public class bankberaksi {
     public static void main (String [] args) {
        bank saya = new bank (2000000);
        saya.cekSaldo ();
        saya.simpanUang(100000);
        saya.ambil (50000);
    }
}
