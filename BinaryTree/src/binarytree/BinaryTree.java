
package binarytree;

public class BinaryTree {
    private Nodo root;

    public BinaryTree() {
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
        return root == null;
    }
    
    public Nodo searchNodo(Nodo raiz, Object element){
        Nodo nodito = null;
        if (raiz.getElement() == element){
            return raiz;
        }
        if (raiz.getLeftSon() != null && nodito == null){
            nodito = searchNodo(raiz.getLeftSon(), element);
        }
        if (raiz.getRightSon() != null && nodito == null){
            nodito = searchNodo(raiz.getRightSon(), element);
        }
        return nodito;
    }
    
    public void insertElement(Object element, Object father){
        Nodo node = new Nodo(element);
        if (isEmpty()){
            setRoot(node);
        }else{
            Nodo nFather = searchNodo(getRoot(), father);
            if (nFather == null){
                System.out.println("El padre no existe");
            } else if (nFather.getLeftSon() == null) {
                nFather.setLeftSon(node);
            } else if (nFather.getRightSon() == null){
                nFather.setRightSon(node);
            } else if (nFather.getLeftSon() != null && nFather.getRightSon() != null){
                System.out.println("El padre ya tiene la cantidad máxima de hijos");
            }
        }
    }
    
    public void preOrden(Nodo raiz){
        if (raiz != null){
            System.out.println("{"+raiz.getElement()+"}");
            preOrden(raiz.getLeftSon());
            preOrden(raiz.getRightSon()); 
        }
    }
    
    public void inOrden(Nodo raiz){
        if (raiz != null){
            inOrden(raiz.getLeftSon());
            System.out.println("{"+raiz.getElement()+"}");
            inOrden(raiz.getRightSon()); 
        }
    }
    
    public void postOrden(Nodo raiz){
        if (raiz != null){
            postOrden(raiz.getLeftSon());
            postOrden(raiz.getRightSon()); 
            System.out.println("{"+raiz.getElement()+"}");
        }
    }
}
