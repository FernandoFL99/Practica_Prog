/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplogithub;

import java.util.Scanner;

/**
 *
 * @author ferna
 */
public class EjemploGitHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        int numero;
        
        System.out.println("Dame un numero");
        numero=teclado.nextInt();
        
        for (int i = 0; i < 10; i++) {
            System.out.println(numero*i);
        }
    }
    
}
