/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;
import Framework.ConsoleFramework;


/**
 *
 * @author ANNAMARIE
 */
public class LinkedListProgram extends ConsoleFramework {
     LinkedList numbers = new LinkedList();
    
     public void startProgram(){
            int capacity = 20;
            numbers = new LinkedList();
            for(int i=0; i< capacity; i++){
                int number = (int)(Math.random() * 100) + 1;
                numbers.addAfter(number);
            }
    }
     public void endProgram(){
        System.out.println("You are done managing your list");
    }
    public int showMenu(){
        System.out.println("1. Add before");
        System.out.println("2. Add after");
        System.out.println("3. Print all");
        System.out.println("4. Get current");
        System.out.println("5. Get item at");
        System.out.println("6. Delete current");
        System.out.println("7. Advance");
        System.out.println("8. Start");
        System.out.println("9. Exit");
        
        int option = this.readInt(">>");
        return option;
}

    public void executeAction(int choice){
        if(choice ==1){
            addBefore();
        }
        else if(choice ==2){
           addAfter();
        }
            else if(choice ==3){
            printAll();
        }
        else if(choice == 4){
           getCurrent();
        }
        else if(choice == 5){
          getItemAt();
        }
        else if(choice == 6){
            delete();
        }
        else if(choice == 7){
            advance();
        }
        else if(choice == 8){
            start();
        }
    }
    public void addBefore(){
        int value = readInt("Enter number:");
        numbers.addBefore(value);
        System.out.println("Added.");
    }
    public void addAfter(){
        int value = readInt("Enter number:");
        numbers.addAfter(value);
        System.out.println("Added.");
    }
    public void printAll(){
        numbers.print();
    }
    public void getCurrent(){
        try{
        System.out.println("Current ="+ numbers.getCurrent());
        
        }catch(NoItemsException e){
            System.out.println(e.toString());
        }
    }
    
    public void getItemAt() {
 
    int pos = this.readInt("Enter Position");
    
    try{
        System.out.println("Item =" + numbers.getItemAt(pos));
    }
    catch(OutOfBoundsException e){
        System.out.println(e.toString());
    }
    }
    
    public void delete(){
   try {
        numbers.removeCurrent();
        System.out.println("Current removed.");

        try {
            System.out.println("Current now = " + numbers.getCurrent());
        }
        catch(NoItemsException e) {
            System.out.println("There is no current item.");
        }

    }
    catch(NoItemsException e) {
        System.out.println(e.toString());
}
    }
    public void start(){
    numbers.start();
    
    try{ 
    System.out.println("Current moved to start:" +numbers.getCurrent());
    }catch(NoItemsException e) {
        System.out.println("The list is empty");
    }
    }
    public void advance(){
    if(numbers.advance()) {

        try {
            System.out.println("Current = " + numbers.getCurrent());
        } catch(NoItemsException e) {
            System.out.println(e.toString());
        }

    } else {

        System.out.println("Cannot advance.");
    }
}
}