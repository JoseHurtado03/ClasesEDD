/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_ejercicios;

/**
 *
 * @author Usuario
 */
public class Lista {
    private Nodo head;
    private int length;
    
    public Lista(){
        this.head = null;
        this.length = 0;
    }
    public Nodo getHead() {
        return head;
    }
    public void setHead(Nodo head) {
        this.head = head;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public Nodo appendBegin(Object element){
        Nodo node = new Nodo(element);
        if (isEmpty()){
            setHead(node);
        } else{
            node.setNext(head);
            setHead(node); 
        }
        length++;
        return node;
    }
    public Nodo append(Object element){
        Nodo node = new Nodo(element);
        if (isEmpty()){
            setHead(node);
        } else{
            Nodo pointer = getHead();
            while (pointer.getNext() != null){
                pointer = pointer.getNext();
            }
            pointer.setNext(node);
        }
        length++;
        return node;
    }
    public Nodo appendIndex(int index, Object element){
        Nodo node = new Nodo(element);
        if (isEmpty()){
            setHead(node);
        } else{
            if (index > getLength()){
                System.out.println("El índice es más grande que el tamaño de la lista");
                return append(node);
            }
            else{
                Nodo pointer = getHead();
                int cont = 0;
                while (cont < (index-1) && pointer.getNext() != null){
                    pointer = pointer.getNext();
                    cont++;
                }
                node.setNext(pointer.getNext());
                pointer.setNext(node);
            }
        }
        length++;
        return node;
    }
    public Nodo deleteBegin(){
        if (!isEmpty()){
            Nodo pointer = getHead();
            setHead(pointer.getNext());
            pointer.setNext(null);
            length--;
            return pointer;
        }
        return null;
    }
    public Nodo deleteLast(){
        if (!isEmpty()){
            Nodo pointer = getHead();
            if (getLength() == 1){
                setHead(null);
                length--;
            } else{
                while (pointer.getNext() != null && pointer.getNext().getNext() != null){
                    pointer = pointer.getNext();
                }
                Nodo nodeReturn = pointer.getNext();
                pointer.setNext(null);
                length--;
                return nodeReturn;
            }
        }
        return null;
    }
    public Nodo deleteInIndex(int index){
        if (!isEmpty()){
            Nodo pointer = getHead();
            if (index > getLength()){
                System.out.println("El índice es más grande que el tamaño de la lista");
                return deleteLast();
            } else{
                int cont = 0;
                while (cont < (index-1) && pointer.getNext() != null){
                    pointer = pointer.getNext();
                    cont++;
                }
                Nodo temp = pointer.getNext();
                pointer.setNext(temp.getNext());
                temp.setNext(null);
                length--;
            }
        }
        return null;
    }
    public Object getElement(int index){
        if (isEmpty()){
            return null;
        } else {
            Nodo pointer = getHead();
            int cont = 0;
            while (cont < (index-1) && pointer.getNext() != null){
                pointer = pointer.getNext();
                cont++;
            }
            return pointer.getElement();
        }
    }
    public void printList(){
        for (int i = 0; i < getLength(); i++) {
            Object element = getElement(i);
            System.out.println(element);
        }
    }
}
