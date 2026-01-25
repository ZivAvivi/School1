public class Queue<T>
{
    private Node<T> first;
    private Node<T> last;

    // פעולה בונה היוצרת תור ריק
    public Queue ()
    {
        this.first = null;
        this.last = null;
    }
    //פעולה המחזירה אמת אם התור ריק ושקר אחרת
    public boolean isEmpty()
    {
        return this.first == null;
    }
    //פעולה המוסיפה איבר לסוף התור
    public void insert(T x)
    {
        Node<T> temp = new Node<T> (x);
        if ( this.last == null)       //התור ריק ?
            this.first = temp;
        else
            this.last.setNext(temp);    //התור לא ריק
        this.last = temp;
    }

    public T remove()
    {
        T x =  this.first.getValue();
        this.first = this.first.getNext();
        if ( this.first == null)       // למקרה שהיה רק איבר אחד בתור
            this.last = null;
        return x;
    }

    public T head()
    {
        return  this.first.getValue();
    }


    public String toString() {
        if (isEmpty()) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");
        Node<T> current = first;

        while (current != null) {
            sb.append(current.getValue());
            if (current.hasNext()) {
                sb.append(", ");
            }
            current = current.getNext();
        }
        sb.append("]");
        return sb.toString();
    }

}
