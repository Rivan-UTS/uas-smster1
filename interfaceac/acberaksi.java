/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceac;

/**
 *
 * @author My PC
 */
public class acberaksi {
    public static void main(String[] args) {
        ac acruangan = new ac();
        System.out.println("Status ac saat ini: off");

        acruangan.hidupkanac();
        acruangan.matikanac();
        acruangan.hidupkanac();
        acruangan.hidupkanac();
        acruangan.hidupkanac();

        acruangan.dinginkanac();
        acruangan.panaskanac();
        acruangan.panaskanac();
        acruangan.dinginkanac();
        acruangan.dinginkanac();
    }
}
