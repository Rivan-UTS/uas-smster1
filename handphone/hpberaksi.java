/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package handphone;

/**
 *
 * @author My PC
 */
public class hpberaksi {
    public static void main(String[] args){
        hp hpku = new hp ();
        hpku.hidupkan = "handphonehidup";
        hpku.lakukanpanggilan = "kring kring kring panggilan dilakukan";
        hpku.kirimsms = "dung dung sms berhasil terkirim";
        hpku.matikan = "handphone mati";
        
        System.out.println("hidupkan: " + hpku.hidupkan);
        System.out.println("lakukanpanggilan: " + hpku.lakukanpanggilan);
        System.out.println("kirimsms: " + hpku.kirimsms);
        System.out.println("matikan: " + hpku.matikan);
    }
}
