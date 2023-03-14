
package binarytree;

public class Nodo {
    private Object element;
    private Nodo rightSon;
    private Nodo leftSon;
    private Nodo father;

    public Nodo(Object element) {
        this.element = element;
        this.rightSon = null;
        this.leftSon = null;
        this.father = null;
    }

    /**
     * @return the element
     */
    public Object getElement() {
        return element;
    }

    /**
     * @param element the element to set
     */
    public void setElement(Object element) {
        this.element = element;
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
     * @return the LeftSon
     */
    public Nodo getLeftSon() {
        return leftSon;
    }

    /**
     * @param LeftSon the LeftSon to set
     */
    public void setLeftSon(Nodo LeftSon) {
        this.leftSon = LeftSon;
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
}
