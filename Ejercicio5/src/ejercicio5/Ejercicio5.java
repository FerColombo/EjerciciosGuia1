/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author fernando.colombo4
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero");
        int numero = leer.nextInt();
        System.out.println(numero * 2);
        System.out.println(numero * 3);
        System.out.println(Math.sqrt(numero));
    }
    
    
