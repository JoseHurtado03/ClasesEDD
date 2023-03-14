package stack;

public class Main {

    public static void main(String[] args) {
        Stack pilita = new Stack();
        pilita.push(5);
        pilita.push(4);
        pilita.push(3);
        pilita.push(2);
        pilita.push(1);
        pilita.print(pilita, pilita.getSize(), 0);
    }
    
}
