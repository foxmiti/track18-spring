package ru.track.list;

import java.util.NoSuchElementException;

/**
 * Должен наследовать List
 * Односвязный список
 */
public class MyLinkedList extends List {

    Node first;
    Node last;

    private static class Node {
        Node prev;
        Node next;
        int val;

        Node(Node prev, Node next, int val) {
            this.prev = prev;
            this.next = next;
            this.val = val;
        }
    }

    @Override
    void add(int item) {
        if(size != 0){
            Node nod1 = new Node(last, null, item);
            size ++;
            last.next = nod1;
            last = nod1;}
        else {first = new Node(null, null, item);
            last = first;
            size++;}

    }

    @Override
    int remove(int idx) throws NoSuchElementException {
        if ((idx <  size) & (idx >= 0)){
            if (size > 1){
                int i = 0;
                Node n = first;
                for (; i < idx ; i++)
                    n = n.next;
                n.prev.next = n.next;
                if (n.next != null)
                    n.next.prev = n.prev;
                size --;
                return n.val;}
            else {
                size--;
                return last.val;
            }
        }
        else throw new NoSuchElementException();
    }

    @Override
    int get(int idx) throws NoSuchElementException {
        if ((idx <  size) & (idx >= 0)) {
            int i = 0;
            Node n = first;
            for (; i < idx ; i++){
                n = n.next;}
            return n.val;
        }
        else throw new NoSuchElementException();
    }

    @Override
    int size() {
        return size;
    }}