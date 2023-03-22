//In this example, we create an ArrayList of Strings and add three elements to it using the add() method. The println() method is used to print the entire list to the console.

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        System.out.println(list); // prints [apple, banana, orange]

    }
}
