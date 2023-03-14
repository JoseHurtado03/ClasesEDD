/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree;

public class Nodo {
    private int element;
    private Nodo father;
    private Nodo rightSon;
    private Nodo leftSon;

    public Nodo(int element) {
        this.element = element;
        this.father = null;
        this.rightSon = null;
        this.leftSon = null;
    }

    /**
     * @return the element
     */
    public int getElement() {
        return element;
    }

    /**
     * @param element the element to set
     */
    public void setElement(int element) {
        this.element = element;
    }

    /**
     * @return the father
     */
    public Nodo getFather() {
        return father;
    }

    /**
     * @param father the father to set
     */
    public void setFather(Nodo father) {
        this.father = father;
    }

    /**
     * @return the rightSon
     */
    public Nodo getRightSon() {
        return rightSon;
    }

    /**
     * @param rightSon the rightSon to set
     */
    public void setRightSon(Nodo rightSon) {
        this.rightSon = rightSon;
    }

    /**
     * @return the leftSon
     */
    public Nodo getLeftSon() {
        return leftSon;
    }

    /**
     * @param leftSon the leftSon to set
     */
    public void setLeftSon(Nodo leftSon) {
        this.leftSon = leftSon;
    }
}
