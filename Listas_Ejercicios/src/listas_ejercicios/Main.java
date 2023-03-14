/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_ejercicios;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("BIENVENIDO");
        System.out.println(" ");
        System.out.println("Selecciona una opción");
        System.out.println("1- Invertir lista");
        System.out.println("2- Invertir y eliminar lista");
        System.out.println("3- Unir y ordenar listas");
        System.out.print("---> ");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        Funciones func = new Funciones();
        if (option == 1){
            Lista list = new Lista();
            list.append(1);
            list.append(2);
            list.append(3);
            list.append(4);
            list.append(5);
            func.InvertirLista(list).printList();
            list.printList();
        } else if(option == 2){
            Lista list = new Lista();
            list.append(1);
            list.append(2);
            list.append(3);
            list.append(4);
            list.append(5);
            System.out.println("Lista Nueva:");
            func.InvertirYBorrarLista(list).printList();
            System.out.println("Lista Original:");
            list.printList();
        } 
    }
    
}
