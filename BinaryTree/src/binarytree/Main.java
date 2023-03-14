
package binarytree;

public class Main {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insertElement(10, null);
        
        tree.insertElement(2, 10);
        tree.insertElement(5, 10);
        
        tree.insertElement(1, 2);
        tree.insertElement(4, 2);
        tree.insertElement(20, 4);
        
        tree.insertElement(3, 5);
        tree.postOrden(tree.getRoot());
    }
    
}
