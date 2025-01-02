/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika1;

/**
 *
 * @author My PC
 */
public class matematika1canggihberaksi {
      public static void main(String[] args) {
        matematika1canggih run = new matematika1canggih();
        
        run.pertambahan(4, 5);
        System.out.println("Hasil pertambahan : " + run.getPertambahan());
        
        run.perkurangan(10, 5);
        System.out.println("Hasil pengurangan : " + run.getPengurangan());
        
        run.perkalian(10, 5);
        System.out.println("Hasil perkalian : " + run.getPerkalian());
        
        run.pembagian(45, 5);
        System.out.println("Hasil pembagian: " + run.getPembagian());

        run.setModulus(10, 3);
        System.out.println("Hasil modulus: " + run.getModulus());
    }
}


