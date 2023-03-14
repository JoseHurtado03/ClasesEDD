/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree;

public class Main {

    public static void main(String[] args) {
        BST tree = new BST();
        tree.insertNodo(tree.getRoot(), 2);
        tree.insertNodo(tree.getRoot(), 1);
        tree.insertNodo(tree.getRoot(), 3);
        tree.preOrden(tree.getRoot());
    }
    
}
