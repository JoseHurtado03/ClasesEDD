/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree;

public class Main {

    public static void main(String[] args) {
        BST tree = new BST();
        tree.insertNodo(tree.getRoot(), 8);
        tree.insertNodo(tree.getRoot(), 3);
        tree.insertNodo(tree.getRoot(), 10);
        tree.insertNodo(tree.getRoot(), 1);
        tree.insertNodo(tree.getRoot(), 6);
        tree.insertNodo(tree.getRoot(), 4);
        tree.insertNodo(tree.getRoot(), 7);
        tree.insertNodo(tree.getRoot(), 14);
        tree.insertNodo(tree.getRoot(), 13);
//        tree.preOrden(tree.getRoot());
//        
        System.out.println("ANCESTRO");
        Nodo first = tree.searchElement(14, tree.getRoot());
        Nodo second = tree.searchElement(14, tree.getRoot());
        
        Nodo ancestro = tree.ACMP(first, second);
        System.out.println("El ancestro más pequeño es: "+ancestro.getElement());
        
    }
    
}
