
package stack;

public class Stack {
    private Nodo peek;
    private int size;

    public Stack() {
        this.peek = null;
        this.size = 0;
    }

    /**
     * @return the peek
     */
    public Nodo getPeek() {
        return peek;
    }

    /**
     * @param peek the peek to set
     */
    public void setPeek(Nodo peek) {
        this.peek = peek;
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
        return peek == null;
    }
    
    public void push(Object element){
        Nodo node = new Nodo(element);
        if (isEmpty()){
            setPeek(node);
        } else{
            node.setNext(getPeek());
            setPeek(node);
        }
        size++;
    }
    
    public Nodo pop(){
        if (!isEmpty()){
            Nodo pointer = getPeek();
            setPeek(pointer.getNext());
            pointer.setNext(null);
            return pointer;
        }
        return null;
    }
    
    public void print(Stack stack, int size, int current){
        if (stack.isEmpty() || current == size){
            return;
        }
        Nodo dato = stack.getPeek();
        System.out.println("Elemento "+ (current+1)+ ": " + dato.getElement());
        stack.pop();
        print(stack, size, current+1);
        stack.push(dato);
    }
}
