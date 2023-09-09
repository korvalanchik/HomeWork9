package HW9;

import java.util.Arrays;

public class MyArrayList {
    private static final int CAPACITY = 10;
    private static final int DELTA_CAPACITY = 5;
    private Object[] data;
    private int size;

    public MyArrayList() {
        data = new Object[CAPACITY];
        size = 0;
    }
    public void add(Object value) {
        int s = size;
        if(size == data.length-1){        // increase [] length on DELTA_CAPACITY
            Object[] tempData = new Object[data.length];
            tempData = Arrays.copyOf(data, data.length);
            s = data.length + DELTA_CAPACITY;
            data = new Object[s];
            data = Arrays.copyOf(tempData, s);
        }
        data[size] = value;
        size++;
    }
    public Object get(int index) {
        if(index < 0 || index > size-1){
            throw new ArrayIndexOutOfBoundsException();
        }
        return data[index];
    }
    public void remove(int index) {
        if(index < 0 || index > size-1){
            throw new ArrayIndexOutOfBoundsException();
        }
        shift(index);
    }
    private void shift(int index) {
        if(index < data.length-1) {
            data[index] = data[index+1];
            shift(index+1);
        }
        if(index == data.length-1) {
            data[size-1] = null;
            size--;
        }
    }
    public int size() {
        return size;
    }
    public void clear() {
        final Object[] delData = data;
        for (int to = size, i = size = 0; i < to; i++)
            delData[i] = null;
    }

    @Override
    public String toString() {
        StringBuilder strList = new StringBuilder();
        for(int i=0;i<size;i++) {
            strList.append(data[i]).append(" ");
        }
        return '{' + strList.toString() + '}';
    }
}
