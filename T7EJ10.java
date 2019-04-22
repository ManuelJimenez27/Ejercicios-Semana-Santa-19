/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t7ej10;

import java.util.Scanner;

/**
 *
 * @author manuel
 */
public class T7EJ10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[] aux = new int[20];
        int[] par = new int[20];
        int[] impar = new int[20];
        int i;
        int pares = 0;
        int impares = 0;

        for (i = 0; i < 20; i++) {
            aux[i] = (int) (Math.random() * 100);
            
            if (aux[i] % 2 == 0) {
                par[pares++] = aux[i];
            } else {
                impar[impares++] = aux[i];
            }
        }

        System.out.println("Array números aleatorios");
        for (i = 0; i < 20; i++) {
            System.out.print(aux[i] + " ");
        }
        System.out.println();


        for (i = 0; i < pares; i++) {
            aux[i] = par[i];
        }

     
        for (i = pares; i < 20; i++) {
            aux[i] = impar[i - pares];
        }

     
        System.out.println("Array ordenado con los pares al principio:");
        for (i = 0; i < 20; i++) {
            System.out.print(aux[i] + " ");
        }
    }
}
