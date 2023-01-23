/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana_2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Arrays {
    public Arrays() {
    }
    public void valueCounter(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el tamaño de la lista: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        int count_zero = 0;
        int count_positive = 0;
        int count_negative = 0;
        for (int i = 0; i < array.length; i++){
            System.out.print("Ingresa el valor de la lista n°"+ (i+1) +": ");
            int number = sc.nextInt();
            array[i] = number;
        }
        sc.close();
        for (int i = 0; i < array.length; i++){
            if (array[i] == 0){
                count_zero ++;
            } else if (array[i] > 1){
                count_positive ++;
            } else{
                count_negative ++;
            }
        }
        System.out.println("Hay "+count_zero+" cero(s) en el Array");
        System.out.println("Hay "+count_positive+" positivo(s) en el Array");
        System.out.println("Hay "+count_negative+" negativo(s) en el Array");
    }
}
