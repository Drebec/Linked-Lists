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
public class Driver {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        Node n = l.addFirst(15);
        l.addLast(20);
        l.addInOrder(18);
        
        int i = 0;
        
        while(i < LinkedList.getSize()) {
            System.out.println("");            
        }
    }
}