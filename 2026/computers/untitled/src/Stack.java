public class Stack<T> {

    private Node<T> head;
    public Stack() {
        this.head = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    // Inserts value x to the head of the stack
    public void push(T x) {
        this.head = new Node<T>(x, this.head);
    }

    // Removes and returns the value at the head
    public T pop() {
        T x = this.head.getValue();
        this.head = this.head.getNext();
        return x;
    }

    // Returns the value at the head without removing it
    public T top() {
        return this.head.getValue();
    }

    // Returns a description of the stack as [x1, x2, ..., xn]
    public String toString() {
        if (this.isEmpty()) {return "[]";}

        String s = "[";
        Node<T> temp = this.head;
        while (temp != null) {
            s += temp.getValue().toString();
            if (temp.hasNext()) {
                s += ", ";
            }
            temp = temp.getNext();
        }

        s += "]";
        return s;
    }
}