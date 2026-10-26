/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258labs;
import java.util.LinkedList;

/**
 *
 * @author ANNAMARIE
 */
public class BuiltInLinkedListDemo {
     public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(12);
        numbers.add(7);
        numbers.add(25);
        numbers.add(4);
        numbers.add(18);

        // 1. Display number of items
        System.out.println("1. Number of items: " + numbers.size());

        // 2. Display all items
        System.out.println("2. All items:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        // 3. Add item
        numbers.add(30);
        System.out.println("3. After adding 30: " + numbers);

        // 4. Add item at position
        numbers.add(2, 15);
        System.out.println("4. After adding 15 at index 2: " + numbers);

        // 5. Remove item at position
        numbers.remove(4);
        System.out.println("5. After removing index 4: " + numbers);

        // 6. Get item at position
        System.out.println("6. Item at index 3: " + numbers.get(3));

        // 7. Replace item at position
        numbers.set(0, 100);
        System.out.println("7. After replacing index 0: " + numbers);

        // 8. Add to front
        numbers.addFirst(200);
        System.out.println("8. After adding 200 to front: " + numbers);

        // 9. Add to end
        numbers.addLast(300);
        System.out.println("9. After adding 300 to end: " + numbers);

        // 10. Remove first
        numbers.removeFirst();
        System.out.println("10. After removing first: " + numbers);

        // 11. Remove last
        numbers.removeLast();
        System.out.println("11. After removing last: " + numbers);
    }
}
