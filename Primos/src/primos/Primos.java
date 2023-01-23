/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primos;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Primos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Números Primos");
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Quieres saber si un número es primo? (y/n)");
        System.out.println("1- Sí");
        System.out.println("2- No");
        int option_uno;
        option_uno = sc.nextInt();
        if (option_uno == 1){
            System.out.print("Ingresa un número: ");
            int num = sc.nextInt();
            Funciones funct = new Funciones();
            boolean is_prime = calculate_primes(num);
            if (is_prime){
                System.out.println("El número es primo");
            } else{
                System.out.println("El número NO es primo");
            }
        } else{
            System.out.println("¿Entonces qué haces aquí? Chao.");
        } 
    }

    public static boolean calculate_primes(int num){
        int aux = num - 1;
        while (aux > 1){
            if (num % aux == 0){
                return false;
            }
            else{
                aux--;
            }
        }
        return true;
    }
}
    

