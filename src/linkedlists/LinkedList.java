/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlists;

/**
 *
 * @author Drew
 */
public class LinkedList {

    private Node head, tail, current;
    private int size;

    public LinkedList() {

    }

    public void addFirst(int element) {
        head = new Node(element, head);
        if (size == 0) {
            tail = head;
        }
        size++;
    }

    public void addLast(int element) {
        Node newNode = new Node(element, null);

        if (size == 0) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
        size++;
    }
    
    public void addInOrder(int value) {
        Node newNode = new Node(value, null);
        current = head;
        Node temp = null;
        
        boolean done = false;
        while(!done) {
            if(value >= head.getElement()) {
                newNode.setNext(head);
                head = newNode;
                done = true;
            } else if(value <= current.getElement()) {
                temp = current;
                current = current.getNext();
            } else {
                temp.setNext(newNode);
                newNode.setNext(current);                
            }
        }
    }

}
