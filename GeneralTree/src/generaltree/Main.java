
package generaltree;

public class Main {

    public static void main(String[] args) {
        GeneralTree tree = new GeneralTree();
        tree.insertRecursive(10, null, tree.getRoot());
        
        tree.insertRecursive(1, 10, tree.getRoot());
        tree.insertRecursive(5, 10, tree.getRoot());
        tree.insertRecursive(8, 10, tree.getRoot());
        
        tree.insertRecursive(7, 1, tree.getRoot());
        tree.insertRecursive(9, 1, tree.getRoot());
        
        tree.insertRecursive(2, 5, tree.getRoot());
        
        tree.printPreOrden(tree.getRoot());
    }
    
}
