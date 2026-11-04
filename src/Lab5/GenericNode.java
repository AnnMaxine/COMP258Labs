/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

/**
 *
 * @author ANNAMARIE
 */
public class GenericNode<T> {
    private T data;
    public GenericNode<T> next;
    
    public T getData() {
        return data;
    }

    public GenericNode (T data) {
        this.data = data;
    }

  
    }

