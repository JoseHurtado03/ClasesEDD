/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

public class Queue {
    private Nodo head;
    private Nodo tail;
    private int size;

    public Queue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * @return the head
     */
    public Nodo getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(Nodo head) {
        this.head = head;
    }

    /**
     * @return the tail
     */
    public Nodo getTail() {
        return tail;
    }

    /**
     * @param tail the tail to set
     */
    public void setTail(Nodo tail) {
        this.tail = tail;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean isEmpty(){
        return getHead() == null;
    }
    
    public Nodo enqueue(Object element){
        Nodo node = new Nodo(element);
        if (isEmpty()){
            setHead(node);
            setTail(node);
        } else{
            Nodo pointer = getTail();
            pointer.setNext(node);
            setTail(node);
        }
        size++;
        return node;
    }
    
    public Nodo dispatch(){
        if (!isEmpty()){
            Nodo pointer = getHead();
            setHead(pointer.getNext());
            pointer.setNext(null);
            if (getHead() == null){
                setTail(null);
            }
            size--;
            return pointer;
        }
        return null;
    }
    
    public void dequeue(){
        if (!isEmpty()){
            Nodo pointer = getHead();
            setHead(pointer.getNext());
            pointer.setNext(null);
            if (getHead() == null){
                setTail(null);
            }
            size--;
        }
    }
    
    public void print(){
        for (int i = 0; i < getSize(); i++) {
            Nodo node = getHead();
            System.out.println("Elemento "+(i+1)+": "+node.getElement());
            Nodo aux = dispatch();
            enqueue(aux);
        }
    }
}
