/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;
import Lab4.Widget;
/**
 *
 * @author ANNAMARIE
 */
public class GenericList<T> {
    
    private GenericNode<T> items;
    private GenericNode<T> current;
    
    public void add(T item){
        if(items==null){
            items = new GenericNode(item);
            current=items;
        }
        else{
        current.next=new GenericNode(item);
        current = current.next;
        }
    }
    
    public T getCurrent(){
    return current.getData();
    }
    
    public void print () {
        GenericNode<T> temp = items;
        while (temp != null){
            System.out.println(temp.getData());
            temp = temp.next;
        }
    }
    
    public static void main(String[] args) {
        
        GenericList<Widget> list = new GenericList<Widget>();
        
        
        list.add(new Widget (50, "Saw"));
        list.add(new Widget (30, "Hammer"));
        list.add(new Widget (70, "Axe"));
        list.add(new Widget (60, "Drill"));
      
        list.add(new Widget (55, "Apple"));
        list.add(new Widget (65, "Plank"));
        list.add(new Widget (15, "Banana"));
        
        Widget x = list.getCurrent();
        System.out.println(">>"+x);
        
        
    } 
}
