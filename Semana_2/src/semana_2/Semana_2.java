/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana_2;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Semana_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("****BIENVENIDO****");
        System.out.println("1- Fibonacci");
        System.out.println("2- Contar elementos de un Array");
        System.out.println("3- De String a Array");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if (option == 1){
            System.out.print("Ingresa el último número de la sucesión: ");
            int maxNumber = sc.nextInt();
            Fibonacci fibo = new Fibonacci();
            fibo.calculateFibo(maxNumber);
        } else if (option == 2){
            Arrays valuec = new Arrays();
            valuec.valueCounter();
        } else{
            
        }
    }
    
}
