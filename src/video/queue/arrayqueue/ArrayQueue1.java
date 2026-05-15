package video.queue.arrayqueue;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/*
 * 环形数组实现队列1
 * tail始终要占一个位
 * */

public class ArrayQueue1<E> implements Queue<E>, Iterable<E> {

    private final E[] array;
    private int head = 0;
    private int tail = 0;

    public ArrayQueue1(int capacity) {
        array = (E[]) new Object[capacity + 1];
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return head == tail;
    }

    public boolean isFull() {
        return (tail + 1) % array.length == head;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int p = head;

            @Override
            public boolean hasNext() {
                return p != tail;
            }

            @Override
            public E next() {
                E value = array[p];
                p = (p + 1) % array.length;
                return value;
            }
        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean offer(E e) {
        if (isFull()) {
            return false;
        }
        array[tail] = e;
        tail = (tail + 1) % array.length;
        return true;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        E value = array[head];
        array[head] = null;
        head = (head + 1) % array.length;
        return value;
    }

    @Override
    public E element() {
        return null;
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return array[head];
    }
}
