package implementhemethodsofarraylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void addAtIndex(int index, E e) {
        if (index >= elements.length) {
            ensureCapa();
        }
        if (index < size) {
            size++;
            for (int i = size - 1; i > index; i--) {
                elements[i] = elements[i - 1];
            }
        } else {
            for (int i = size; i < index; i++) {
                elements[i] = null;
            }
            this.size = index+1;
        }
        elements[index] = e;


    }

    public E remove(int index) {
        E valueAtIndex = (E) elements[index];
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return valueAtIndex;
    }

    public int getSize() {
        return this.size;
    }

    public E clone() {
        String txt = "";
        for (int i = 0; i != size; i++) {
            txt += elements[i] + " ";
        }
        return (E) txt;
    }

    void addValue(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public boolean contains(E o) {
        for (int i = 0; i != size; i++) {
            if (o.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public void clear() {
        for (int i = 0; i <= size; i++) {
            elements[i] = null;
        }
        this.size = 0;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }
}
