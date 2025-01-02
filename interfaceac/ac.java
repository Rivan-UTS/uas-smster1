/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceac;

/**
 *
 * @author My PC
 */
public class ac implements interfaceac{
    int statusac;
    
    public void hidupkanac(){
        if(statusac == OFF){
            statusac = ON;
            System.out.println("Hidupkan AC --> AC dihidupkan");
        } else {
            System.out.println("Hidupkan AC --> AC sudah hidup");
        }
    }

    public void matikanac() {
        if(statusac == ON){
            statusac = OFF;
            System.out.println("Matikan AC --> AC dimatikan");
        } else {
            System.out.println("Matikan AC --> AC sudah mati");
        }
    }

    public void dinginkanac() {
        if(statusac == SUHUPANAS){
            statusac = SUHUDINGIN;
            System.out.println("Dinginkan AC --> AC didinginkan");
        } else {
            System.out.println("Dinginkan AC --> AC sudah dingin");
        }
    }

    public void panaskanac() {
        if(statusac == SUHUDINGIN){
            statusac = SUHUPANAS;
            System.out.println("Panaskan AC --> AC dipanaskan");
        } else {
            System.out.println("Panaskan AC --> AC sudah panas");
        }
    }
}
