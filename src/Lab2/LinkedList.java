/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;

/**
 *
 * @author ANNAMARIE
 */
public class LinkedList {

    private Node items;
    private Node current;

    public LinkedList() {

    }

    public Node getItems() {
        return items;
    }

    public void setItems(Node Items) {
        this.items = Items;
    }

    public Node getCurrent() {
        return current;
    }

    public void setCurrent(Node current) {
        this.current = current;
    }

    public void add(Object item) {

        Node n = new Node(item);
        if (items == null) {
            items = n;
            current = items;
        } else {
            current.next = n;
            current = current.next;
        }
    }

    public void print() {
        Node temp = items;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.next;
        }
    }

    public boolean advance() {
        if (current.next == null) {
            return false;
        } else {
            current = current.next;

        }
        return true;
    }

    public void start() {
        current = items;
    }

    public void addAfter(Object item) {
        Node n = new Node(item);
        if (items == null) {
            items = n;
            current = items;
        } else {
            n.next = current.next;
            current.next = n;
            current = n;
        }
    }

    public void addBefore(Object item) {
        Node n = new Node(item);
        if (items == null) {
            items = n;
            current = items;
        } else if (current == items) {
            n.next = items;
            items = n;
            current = n;
        } else {
            Node temp = items;

            while (temp.next != current) {
                temp = temp.next;
            }

            n.next = current;
            temp.next = n;
            current = n;
        }
    }

    public void removecurrent() {

        Node temp = items;
        if (temp == current) {
            //only 1 item in list
            items = null;
            current = null;
        } else {
            while (temp.next != current) {
                temp = temp.next;
            }
            temp.next = current.next; //or temp.next = temp.next.next;
            current = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(11);
        list.add(77);
        list.add(99);
        list.add(55);
        list.add(33);
        //list.start();
        //list.advance();
        //list.advance();
        //list.removecurrent();
        list.addAfter(66);
        list.addBefore(65);
        list.addBefore(64);
        list.addBefore(63);

        list.print();

    }

}
