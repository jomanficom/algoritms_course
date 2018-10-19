package com.company.structures;

import java.util.ArrayList;
import java.util.List;

public class SingleLinkedList<T> {
    private int size = 0;
    private Node<T> first;

    private static class Node <T> {
        T element;
        Node<T> next;

        public Node(T element, Node<T> next) {
            this.element = element;
            this.next = next;
        }
    }

    public void add(T element){
        Node<T> current = first;
        if (first == null){
            first = new Node<>(element, null);
            size = 1;
        }else {

            while (current.next != null){
                current = current.next;
            }
            current.next = new Node<>(element, null);
            size++;
            //todo complete with recursive method
            //addEl(element, first);
        }
        }

//    private void addEl(T element, Node<T> node) {
//        if(node.next == null){
//           node.next = new Node<>(element, null);
//           size++;
//        } else {
//            addEl(element, node.next);
//        }
//    }

    // O (index) = O (n)

    public boolean add (int index, T element){
        Node<T> current = first;
        Node<T> pevious = null;
        if (size < index){
            return false;
        }else {
            if( index == 0) {
                first = new Node<>(element, first);
            }
            for (int i = 0; i < index ; i++) {
                if (i == index - 1) {
                    pevious = current;
                }
                current = current.next;
                }
                current = new Node<>(element, current);
                pevious.next = current;
            }
            return true;
    }

    public void removeFirst(){
        first = first.next;
        size--;
    }

    public void removeLast(){
        Node<T> current = first;
        while (current.next != null){
            current = current.next;
        }

        current = null;
    }

    public boolean remove(int index){
        Node<T> current = first;
        Node<T> pevious = null;

        if (index > size){
            return false;
        }else {
            for (int i = 0; i <index + 1 ; i++) {
                if (i == index - 1){
                    pevious = current;
                }
                current = current.next;
            }
            pevious.next = current;
        }

        return true;
    }

    public T peek(int index){
        Node<T> current = first;
        if (size < index){
            return null;
        }else {
            for (int i = 0; i < index ; i++) {
                current = current.next;
            }
            return current.element;
        }

    }
    public ArrayList<T> asArrayList(){
        ArrayList<T> arrayList = new ArrayList<>();
        Node<T> current = first;

        while (current != null){
            arrayList.add(current.element);
            current = current.next;
        }

        return arrayList;
    }



}




