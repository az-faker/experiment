package jvm;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @author faker
 * @date 2018/6/29
 * 后进先出
 */
public class MyStack<T> {
    private T[] elements;
    private int size;

    private static final int INIT_CAPACITY = 16;


    public MyStack() {
        elements = (T[]) new Object[INIT_CAPACITY];
    }

    public void push(T item) {
        ensureCapacity();
        elements[size++] = item;
    }

    public T pop() {
        if (size == 0) {
            throw new EmptyStackException();
        } else {
            return elements[--size];
        }
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}
