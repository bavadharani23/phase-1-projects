package DataStructuresArraysAndList;

import java.util.*;

public class LinkedList {
	static Node head; 
	  
   
    class Node 
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
  
    
    void deleteKey(int key)
    {
        
        Node temp = head, prev = null;
  
       
        while (temp != null && temp.data == key) 
        {
            head = temp.next; // Changed head
            temp = head; // Change Temp
        }
  
        // Delete occurrences other than head
        while (temp != null) 
        {
            // Search for the key to be deleted,
            // keep track of the previous node
            // as we need to change 'prev->next'
            while (temp != null && temp.data != key) 
            {
                prev = temp;
                temp = temp.next;
            }
            if (temp == null)
                return;
            prev.next = temp.next;
  
            temp = prev.next;
        }
    }
  
    
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
  
    
    public void printList()
    {
        Node tnode = head;
        while (tnode != null) 
        {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }
  
    
    public static void main(String[] args)
    {
        LinkedList llist = new LinkedList();
  
        llist.push(1);
        llist.push(4);
        llist.push(7);
        llist.push(9);
        llist.push(11);
        llist.push(3);
        llist.push(5);
        llist.push(2);
  
        int key = 2; // key to delete
  
        System.out.println("Created Linked list is:");
        llist.printList();
  
        llist.deleteKey(key);
  
        System.out.println(
            "\nLinked List after Deletion is:");
        llist.printList();
    }


		
	}
	

