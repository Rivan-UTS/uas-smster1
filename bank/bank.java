/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author My PC
 */
public class bank {
    int saldo;
    public bank (int saldo){
        this.saldo = saldo;
    }
    void cekSaldo () {
    System.out.println("selamat datang di bank saya");
    System.out.println("Saldo anda saat ini: Rp." + saldo);
    }
    void simpanUang (int simpan) {
    saldo += simpan;
    System.out.println("transaksi terkirim: Rp." + simpan);
    System.out.println("Saldo anda saat ini: Bp." + saldo);
    }
   void ambil (int ambil) {
    saldo -= ambil;
    System.out.println("tabungan yang di ambil: Rp." + ambil);
    System.out.println("Saldo anda saat ini: Bp." + saldo);
   }
}
