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
    private int count;

    public LinkedList() {
        items = null;
        current = null;
        count = 0;

    }

    public Node getItems() {
        return items;
    }

    public void setItems(Node Items) {
        this.items = Items;
    }

    public Object getCurrent() throws NoItemsException{
         
        if(current == null) {
        throw new NoItemsException();
    }
        return current.getData();
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
        count++;
    }

    public void print() {
        Node temp = items;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.next;
        }
    }

    public boolean advance() {
        if(current == null) {
        return false;
    }

    if(current.next == null) {
        return false;
    }

    current = current.next;
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
        count++;
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
        count++;
    }

    public void removeCurrent() throws NoItemsException{
        if(current == null) {
         throw new NoItemsException();
}
        Node temp = items;
        if (temp == current) {
            //only 1 item in list
            items = current.next;
            current = null;
        } else {
            while (temp.next != current) {
                temp = temp.next;
            }
            temp.next = current.next; //or temp.next = temp.next.next;
            current = temp.next;
        }
        count--;
    }
    public Object getItemAt(int pos) throws OutOfBoundsException {

    if(pos < 0 || pos >= count) {
        throw new OutOfBoundsException();
    }

    Node temp = items;

    for(int i = 0; i < pos; i++) {
        temp = temp.next;
    }

    return temp.getData();
}
    public void removeAllOccurances(Object o) {

    Node previous = null;
    Node temp = items;

    while(temp != null) {

        if(temp.getData().equals(o)) {

            if(temp == items) {
                items = temp.next;
            } else {
                previous.next = temp.next;
            }

            if(current == temp) {
                current = temp.next;
            }

            temp = temp.next;
            count--;

        } else {

            previous = temp;
            temp = temp.next;
        }
    }
}

    public static void main(String[] args) {

    LinkedList list = new LinkedList();

    list.addAfter(1);
    list.addAfter(3);
    list.addAfter(4);
    list.addAfter(5);
    list.addAfter(3);
    list.addAfter(4);
    list.addAfter(3);
    list.addAfter(4);
    list.addAfter(1);
    list.addAfter(2);
    list.addAfter(5);
    list.addAfter(6);

    System.out.println("BEFORE:");
    list.print();

    try {
        list.removeAllOccurances(4);
    } catch (Exception e) {
        System.out.println(e.toString());
    }

    System.out.println("AFTER:");
    list.print();
    }

    public void recursivePrint() {
        recursivePrint(items);
    }

    public void recursivePrint(Node temp) {
        if (temp == null) {
            return;
        }

        System.out.print(temp.getData() + " ");
        recursivePrint(temp.next);
    }

    public void recursivePrintBackward() {
        recursivePrintBackward(items);
    }

    public void recursivePrintBackward(Node temp) {
        if (temp == null) {
            return;
        }

        recursivePrintBackward(temp.next);
        System.out.print(temp.getData() + " ");
    }
}