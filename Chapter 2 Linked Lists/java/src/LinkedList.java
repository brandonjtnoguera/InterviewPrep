/**
 * @author Brandon Tenorio
 * @param <T> Generic type
 */
public class LinkedList<T> {
    private Node<T> head;
    private int size = 0;

    public void addToEnd(T data){
        if(head == null){
            head = new Node<>(data);
            size++;
            return;
        }
        Node<T> current = head;
        while(current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(new Node<>(data));
        size++;
    }

    public void addToBeginning(T data){
        Node<T> newHead = new Node<>(data);
        newHead.setNext(head);
        head = newHead;
        size++;
    }

    public T removeFromEnd(){
        T data;
        Node<T> current = head;
        while(current.getNext() != null){
            current = current.getNext();
        }
        data = current.getData();
        current = null;
        size--;
        return data;
    }

    public T removeFromBeginning(){
        T data = head.getData();
        head = head.getNext();
        head = null;
        size--;
        return data;
    }

    public void deleteWithValue(T data){
        if(head == null) return;
        if(head.getData() == data){
            head = head.getNext();
            return;
        }
        Node<T> current = head;
        while(current.getNext() != null){
            if(current.getNext().getData() == data){
                current.setNext(current.getNext().getNext());
                return;
            }
            current = current.getNext();
        }
    }

    public void removeDuplicates(){
        Node<T> current = head;
    }

    public void clear(){
        head = null;
    }
}
