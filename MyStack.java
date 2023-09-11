package HW9;

import java.util.Objects;

public class MyStack <T> extends MyLinkedList<T> {
    private MyStack.Node<T> down;
    private MyStack.Node<T> up;
    private int size;
    public void push(T value) {
        MyStack.Node<T> node = new MyStack.Node<>(value);
        if(down == null){
            down = node;
            up = node;
        } else {
            up.next = node;
            node.previous = up;
            up = node;
        }
        this.size++;
    }

    public T peek() {
        if(up == null) return null;
        return up.value;
    }

    public T pop() {
        if(up == null) return null;
        T tempUp = up.value;
        if(up.previous == null) {
            up = null;
        } else {
            up = up.previous;
            up.next = null;
        }
        size--;
        return tempUp;
    }

    public void remove(int index) {
        Objects.checkIndex(index, size);
        Node<T> curr = up;
        Node<T> temp;
        for (int i = 0; i<index; i++) {
            curr = curr.previous;
        }
        if(curr == up) {
            temp = curr.previous;
            curr.previous.next = null;
            up = temp;
        } else if(curr == down) {
            temp = curr.next;
            curr.next.previous = null;
            down = temp;
        } else
        {
            temp = curr.next;
            temp.previous = curr.previous;
            curr.previous.next = temp;
        }
        size--;
    }

    public void clear() {
        up = down = null;
        this.size = 0;
    }

    public int size() {
        return size;
    }
}
