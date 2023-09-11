package HW9;

public class MyQueue <T> extends MyLinkedList<T>{
    private MyQueue.Node<T> head;
    private MyQueue.Node<T> tail;
//    private int size;
    public void add(T value) {
        MyQueue.Node<T> node = new MyQueue.Node<>(value);
        if(head == null){
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
        size++;
    }

    public T peek() {
        if(head == null) return null;
        return head.value;

    }

    public T poll() {
        if(head == null) return null;
        T tempHead = head.value;
        head = head.next;
        head.previous = null;
        size--;
        return tempHead;
    }

    public void clear() {
        head = tail = null;
        size = 0;
    }

}
