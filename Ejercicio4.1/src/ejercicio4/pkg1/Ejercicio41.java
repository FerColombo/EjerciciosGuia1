/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.pkg1;

import java.util.Scanner;

/**
 *
 * @author fernando.colombo4
 */
public class Ejercicio41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese grados centrigados");
        int numero = leer.nextInt();
        int F = 32 + (9 * numero / 5);
        System.out.println("Los grados ingresados " + numero + " en Farenhait son: " + F);
    }
    
}
