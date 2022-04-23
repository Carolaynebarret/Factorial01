/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial01;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author carol
 */
public class Factorial01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
	System.out.println("Escolha um número inteiro para ser fatorado: ");
	int n = sc.nextInt();
	BigInteger x = factorial(n);
	System.out.println("O resultado da fatoração é: " + x);
	}
	
	public static BigInteger factorial(int n) {
            int controle = 0;
            BigInteger resultado = BigInteger.ONE;
                for (int i = 1; i <= n; i++) {
                      controle++;
                       resultado = resultado.multiply(BigInteger.valueOf(i));
                       
        }
        return resultado;
       

        // TODO code application logic here
    }
    
    
}
