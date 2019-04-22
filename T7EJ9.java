/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t7ej9;

import java.util.Scanner;

/**
 *
 * @author manuel
 */
public class T7EJ9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca 8 numeros de uno en uno");
        int[] num = new int[8];
        for (int i = 0; i < 8; i++) {
            num[i] = sc.nextInt();
        if (num[i] % 2 == 0) {
            System.out.println(num[i] + " par");
        } else {
            System.out.println(num[i] + " impar");
        }
        }
       
    }

}
