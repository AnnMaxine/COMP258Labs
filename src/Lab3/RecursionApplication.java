/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3;

import java.util.Scanner;
import Lab2.LinkedList;
import Lab2.Node;

/**
 *
 * @author ANNAMARIE
 */
public class RecursionApplication {
  
    //A recursive method is a method that:
    //1. Calls itself (is recursive)
    //2. Works towards a base case (or base cases)
//    public static int sumNumbersTo(int x){
//         
//        if(x==1)
//            return 1;
//        return x + sumNumbersTo(x-1);
//    }
    public static long factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int myPow(int a, int b) {

        if (b == 0) {
            return 1;
        }

        return a * myPow(a, b - 1);
    }

    public static boolean isPalindrome(String s, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        return isPalindrome(s, start + 1, end - 1);
    }

    public static void printList(Node temp) {

        if (temp == null) {
            return;
        }

        System.out.print(temp.getData() + " ");

        printList(temp.next);
    }

    public static void printListBackward(Node temp) {

        if (temp == null) {
            return;
        }

        printListBackward(temp.next);

        System.out.print(temp.getData() + " ");
    }

    public static void indentoTron(int n) {
    indentoTron(n, 1);
}

private static void indentoTron(int n, int callNumber) {
    if (callNumber > n) {
        return;
    }

    System.out.println("This was written by call number " + callNumber + ".");

    indentoTron(n, callNumber + 1);

    System.out.println("This ALSO written by call number " + callNumber + ".");
}

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== RECURSION MENU =====");
            System.out.println("1. Factorial");
            System.out.println("2. MyPow");
            System.out.println("3. IsPalindrome");
            System.out.println("4. PrintList: Forward");
            System.out.println("5. PrintList: Backward");
            System.out.println("6. IndentOTron");
            System.out.println("7. Fibonacci");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number (0-20): ");
                    int factNum = scanner.nextInt();

                    if (factNum >= 0 && factNum <= 20) {
                        System.out.println("Factorial = " + factorial(factNum));
                    } else {
                        System.out.println("Please enter a number from 0 to 20.");
                    }
                    break;

                case 2:
                    System.out.print("Enter the base: ");
                    int base = scanner.nextInt();

                    System.out.print("Enter the exponent (0 or greater): ");
                    int exponent = scanner.nextInt();

                    if (exponent >= 0) {
                        System.out.println("Result = " + myPow(base, exponent));
                    } else {
                        System.out.println("The exponent cannot be negative.");
                    }
                    break;

                case 3:
                    System.out.print("Enter a word: ");
                    String word = scanner.next();

                    System.out.println("Is it a palindrome? "
                            + isPalindrome(word, 0, word.length() - 1));
                    break;

                case 4: {
                    LinkedList list = new LinkedList();

                    list.add(10);
                    list.add(20);
                    list.add(30);
                    list.add(40);

                    System.out.print("List forward: ");
                    list.recursivePrint();
                    System.out.println();
                    break;
                }
                case 5: {
                    LinkedList list = new LinkedList();

                    list.add(10);
                    list.add(20);
                    list.add(30);
                    list.add(40);

                    System.out.print("List backward: ");
                    list.recursivePrintBackward();
                    System.out.println();
                    break;
                }

                case 6:
                    indentoTron(4);
                    break;

                case 7:
                    System.out.print("Enter a number: ");
                    int fibNum = scanner.nextInt();

                    if (fibNum >= 0 && fibNum <= 40) {
                        System.out.println("Fibonacci = " + fibonacci(fibNum));
                    } else {
                        System.out.println("Please enter a number from 0 to 40.");
                    }
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please select 0-7.");
            }

        } while (choice != 0);

        scanner.close();
    }
}
