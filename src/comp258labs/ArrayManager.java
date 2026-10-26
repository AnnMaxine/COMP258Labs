/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258labs;

/**
 *
 * @author ANNAMARIE
 */
public class ArrayManager {

    private Object[] items;
    private int count; //the number of items used in the array

    public ArrayManager() {
        items = new Object[5];
        count = 0;
    }

    public ArrayManager(int capacity) {
        items = new Object[capacity];
        count = 0;
    }

    public ArrayManager(Object[] items) {
        this.items = items;
        count = items.length;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    public Object get(int index) throws OutOfBoundsException {
        
        if(index < 0 || index >= count) {
            throw new OutOfBoundsException();
        }
        return items[index];
    }

    public void add(Object item) {
        if (count >= items.length) {
            Object[] temp = new Object[items.length + 10];
            System.arraycopy(items, 0, temp, 0, count);
            items = temp;
            items[count] = item;
        }
        items[count] = item;
        count++;
    }

    public void remove(int pos) throws NoItemsException, OutOfBoundsException {

    if (isEmpty()) {
        throw new NoItemsException();
    }

    if (pos < 0 || pos >= count) {
        throw new OutOfBoundsException();
    }

    Object[] temp = new Object[items.length];

    System.arraycopy(items, 0, temp, 0, pos);

    System.arraycopy(items, pos + 1, temp, pos, count - pos - 1);

    items = temp;

    count--;

    }

    public void addAt(Object item, int pos) {
        //resize the array if needed
        Object[] temp;
        if (count >= items.length) {
            temp = new Object[items.length + 10];
        } else {
            temp = new Object[items.length];
        }
        //copy 0-pos to new array
        System.arraycopy(items, 0, temp, 0, count);
        //add new number
        temp[pos] = item;
        //copy pos-end to new array
        System.arraycopy(items, pos, temp, pos + 1, items.length - pos - 1);
        //assign new array back to items

        //count it
        count++;

        //assign temp back to items
        items = temp;

    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    public void printArray() {
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }
 public void removeAllOccurances(Object o)
        throws NoItemsException, OutOfBoundsException {

    int i = 0;

    while (i < count) {

        if (items[i].equals(o)) {
            remove(i);
        } else {
            i++;
        }
    }
}
    public static void main(String[] args) {

    ArrayManager am = new ArrayManager();

    am.add(1);
    am.add(3);
    am.add(4);
    am.add(5);
    am.add(3);
    am.add(4);
    am.add(3);
    am.add(4);
    am.add(1);
    am.add(2);
    am.add(5);
    am.add(6);

    System.out.println("BEFORE:");
    am.print();

    try {
        am.removeAllOccurances(4);
    } catch (Exception e) {
        System.out.println(e.toString());
    }

    System.out.println("AFTER:");
    am.print();

    System.out.println("SIZE: " + am.size());

    }
}
