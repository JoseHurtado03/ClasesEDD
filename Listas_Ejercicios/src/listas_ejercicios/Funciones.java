/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_ejercicios;

public class Funciones {
    public Lista InvertirLista(Lista list){
        Lista newList = new Lista();
        Nodo pointer = list.getHead();
        while (pointer != null){
            newList.appendBegin(pointer.getElement());
            pointer = pointer.getNext();
        }
        return newList;
    }
    public Lista InvertirYBorrarLista(Lista list){
        Lista newList = new Lista();
        Nodo pointer = list.getHead();
        while (pointer != null){
            newList.appendBegin(pointer.getElement());
            pointer = pointer.getNext();
            list.deleteBegin();
        }
        return newList;
    }
    public Lista OrdenarListas(Lista listUno, Lista listDos){
        Lista FinalList = new Lista();
        Nodo pointerUno = listUno.getHead();
        Nodo pointerDos = listDos.getHead();
        while (pointerUno != null || pointerDos != null){
            if (pointerUno == null){
                FinalList.append(pointerDos.getElement());
                pointerDos = pointerDos.getNext();
                listDos.deleteBegin();
            } else if (pointerDos == null){
                FinalList.append(pointerUno.getElement());
                pointerUno = pointerUno.getNext();
                listUno.deleteBegin();
            } else {
                System.out.print("YA VA, DESPUÉS SIGO");
            }
        }
        return FinalList;
    }
}
