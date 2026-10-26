/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;

/**
 *
 * @author ANNAMARIE
 */
public class NoItemsException extends Exception{
     @Override
    public String toString() {
        return "Operation not allowed on empty collection";
    }
}
