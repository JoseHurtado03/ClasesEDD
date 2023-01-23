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
public class Fibonacci {
    public Fibonacci(){
    }
    public void calculateFibo(int maxNumber){
        int num_uno = 0;
        int num_dos = 1;
        System.out.println("La sucesión de fibonacci es:");
        while (num_uno < maxNumber){
            int aux = num_uno;
            System.out.print(num_uno + " ");
            num_uno = num_dos;
            num_dos += aux;
        }
    }
}
