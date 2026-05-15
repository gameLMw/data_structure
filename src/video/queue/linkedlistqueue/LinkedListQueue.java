package video.queue.linkedlistqueue;

/*
 * 链表实现队列
 * */

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class LinkedListQueue<E> implements Queue<E>, Iterable<E> {

    private static class Node<E> {
        E value;
        Node next;

        public Node(E value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node<E> head = new Node<>(null, null);
    private Node<E> tail = head;
    private int size;//节点个数
    private int capacity = Integer.MAX_VALUE;//队列容量

    {
        tail.next = head;
    }

    public LinkedListQueue(int capacity) {
        this.capacity = capacity;
    }

    public LinkedListQueue() {
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

    // 入队
    //e: 入队元素
    @Override
    public boolean offer(E e) {
        if (isFull()) {
            return false;
        }
        Node<E> added = new Node<>(e, head);
        tail.next = added;
        tail = added;
        size++;
        return true;
    }

    @Override
    public E remove() {
        return null;
    }

    // 出队
    @Override
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        Node<E> first = head.next;
        head.next = first.next;
        if (first == tail) {
            tail = head;
        }
        size--;

        return (E) first.value;
    }

    @Override
    public E element() {
        return null;
    }

    //返回第一个元素
    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return (E) head.next.value;
    }

    //返回队列长度
    @Override
    public int size() {
        return size;
    }

    // 判断队列是否为空
    @Override
    public boolean isEmpty() {
//        Node<E> p = head;
//        while (p != tail) {
//            p = p.next;
//        }
//        return p.next ==  tail;

        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node<E> p = head.next;
            int count = size;

            @Override
            public boolean hasNext() {
                return count > 0;
            }

            @Override
            public E next() {
                E value = p.value;
                p = p.next;
                count--;
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

    // 判断队列是否已满
    public boolean isFull() {
        return size == capacity;
    }
}
