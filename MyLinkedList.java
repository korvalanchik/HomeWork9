package HW9;

import java.util.Objects;

public class MyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;
    public void add(T value) {
        Node<T> node = new Node<>(value);
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

    public T get(int index) {
        Objects.checkIndex(index, size);
        Node<T> curr = head;
        for (int i = 0; i<index; i++) {
            curr = curr.next;
        }
        return curr.value;
    }

    public void remove(int index) {
        Objects.checkIndex(index, size);
        Node<T> curr = head;
        Node<T> temp;
        for (int i = 0; i<index; i++) {
            curr = curr.next;
        }
        if(curr == head) {
            temp = curr.next;
            curr.next.previous = null;
            head = temp;
        } else if(curr == tail) {
            temp = curr.previous;
            curr.previous.next = null;
            tail = temp;
        } else
        {
            temp = curr.previous;
            temp.next = curr.next;
            curr.next.previous = temp;
        }
        size--;
    }

    public void clear() {
        head = tail = null;
        size = 0;
    }
    public int size() {
        return size;
    }

    static class Node<T> {
        T value;
        Node<T> next;
        Node<T> previous;

        public Node(T value) {
            this.value = value;
        }
    }
}
