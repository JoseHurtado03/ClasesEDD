/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree;

public class BST {
    private Nodo root;

    public BST() {
        this.root = null;
    }

    /**
     * @return the root
     */
    public Nodo getRoot() {
        return root;
    }

    /**
     * @param root the root to set
     */
    public void setRoot(Nodo root) {
        this.root = root;
    }
    
    public boolean isEmpty(){
        return getRoot() == null;
    }
    
    public void insertNodo(Nodo raiz, int element){
        Nodo node = new Nodo(element);
        if (isEmpty()) {
            setRoot(node);
        } else {
            if (element <= raiz.getElement()) {
                if(raiz.getLeftSon() == null) {
                    raiz.setLeftSon(node);
                    node.setFather(raiz);
                } else {
                    insertNodo(raiz.getLeftSon(),element);
                }
            } else {
                if(raiz.getRightSon() == null) {
                    raiz.setRightSon(node);
                    node.setFather(raiz);
                } else {
                    insertNodo(raiz.getRightSon(),element);
                }
            }
        }
    }
    
    public void deleteNodo(Nodo raiz, int element) {
        if (!isEmpty()) {
            if (raiz == null) {
                System.out.println("No se consiguio el nodo");
            } else {
                if (element == raiz.getElement()) {
                    if (raiz.getLeftSon() == null && raiz.getRightSon() == null) {
                        // Es una Hoja
                        if (element < raiz.getFather().getElement()) {
                            raiz.getFather().setLeftSon(null);
                        } else {
                            raiz.getFather().setRightSon(null);
                        }
                        raiz.setFather(null);
                    } else if(raiz.getLeftSon() == null) {
                        // Tiene solo hijo derecho
                        if (element < raiz.getFather().getElement()) {
                            raiz.getFather().setLeftSon(raiz.getRightSon());
                        } else {
                            raiz.getFather().setRightSon(raiz.getRightSon());
                        }
                        raiz.getRightSon().setFather(raiz.getFather());
                        raiz.setRightSon(null);
                        raiz.setFather(null);
                    } else if(raiz.getRightSon() == null) {
                        // Tiene solo hijo izquierdo
                        if (element < raiz.getFather().getElement()) {
                            raiz.getFather().setLeftSon(raiz.getLeftSon());
                        } else {
                            raiz.getFather().setRightSon(raiz.getLeftSon());
                        }
                        raiz.getLeftSon().setFather(raiz.getFather());
                        raiz.setLeftSon(null);
                        raiz.setFather(null);
                    }
                } else if(element < raiz.getElement()){
                    deleteNodo(raiz.getLeftSon(), element);
                } else {
                    deleteNodo(raiz.getRightSon(), element);
                }
            }
        } else {
            System.out.println("No hay elementos para eliminar");
        }
    }
    
    public void preOrden(Nodo root){
        if(root != null){
            System.out.println("{ "+root.getElement()+" }");
            preOrden(root.getLeftSon());
            preOrden(root.getRightSon());
        }
    }
    
    public void inOrden(Nodo root){
        if (root != null){
            preOrden(root.getLeftSon());
            System.out.println("{ "+root.getElement()+" }");
            preOrden(root.getRightSon());
        }
    }
    
    public void postOrden(Nodo root){
        preOrden(root.getLeftSon());
        preOrden(root.getRightSon());
        System.out.println("{ "+root.getElement()+" }");
    }
    
    public Nodo searchElement(int element, Nodo raiz){
        if (raiz == null){
            return null;
        } else{
            if (raiz.getElement() == element){
                return raiz;
            } else{
                if (element < raiz.getElement()){
                    return searchElement(element, raiz.getLeftSon());
                }else{
                    return searchElement(element, raiz.getRightSon());
                }
            }
        }
    }
    
    public Nodo ACMP(Nodo first, Nodo second){
        if(this.root == first || this.root == second){
            return root;
        } else if (first.getElement() == second.getElement()){
            return first.getFather();
        }else{
            Nodo ancestor = ancestor(this.root, first, second);
            return ancestor;
        }
    }
    
    public Nodo ancestor(Nodo raiz, Nodo first, Nodo second){
        Nodo aux = this.root;
        while (aux != null){
            if (aux == first || aux == second){
                return aux.getFather();
            }
            if (first.getElement() > aux.getElement() && second.getElement() > aux.getElement()){
                aux = aux.getRightSon();
            } else if (first.getElement() < aux.getElement() && second.getElement() < aux.getElement()){
                aux = aux.getLeftSon();
            } else{
                return aux;
            }
        }
        return null;
    }
}
