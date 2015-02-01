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
public class Node {
    private int element;
    private Node next;
    
    public Node(int element, Node next) {
        this.element = element;
        this.next = next;
    }
    
    public int getElement() {
        return element;
    }
    
    public Node getNext() {
        return next;
    }
    
    public void setNext(Node next) {
        this.next = next;
    }
}
