/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ackermann;

import java.util.Scanner;

/**
 *
 * @author Luis Alejandro Castro Contreras
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de la funcion de Ackermann-Peter");
        System.out.println("-------------------------------------------");
        
        System.out.println("Ejemplos:");
        System.out.println("Ackermann(1, 1) = " + AckermannIterativo.ackermann(1, 1));
        System.out.println("Ackermann(2, 1) = " + AckermannIterativo.ackermann(2, 1));
        System.out.println("-------------------------------------------");
        
        System.out.println("Libre: (Solo se aceptan numeros enteros)");
        System.out.print("Ingrese el valor de m: ");
        int m = scanner.nextInt();
        
        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();
        
        System.out.println("\nCalculando A(" + m + ", " + n + ")...");
        int resultado = AckermannIterativo.ackermann(m, n);
        System.out.println("A(" + m + ", " + n + ") = " + resultado);
        
        scanner.close();
        System.out.println("-------------------------------------------");
    }
    
}
