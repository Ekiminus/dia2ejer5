//Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
//Nota: investigar la función Math.sqrt().

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia2ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Raven
 */
public class Dia2ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero");
        numero = leer.nextInt();
        
        System.out.println("La raiz cuadrada del numero es: " + Math.sqrt(numero));
        System.out.println("El doble del numero es: " + numero*2);
        System.out.println("El triple del numero es: " + numero*3);
        
        
        
    }
    
}
