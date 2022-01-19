import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class prog_7_set_and_list {
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        //Set is unordered collection of unique element.
        //It skips any repeatation or duplication in the values.

        Set<Integer> t = new HashSet<Integer>();  //This is HashSet and in this they are in order but for only positive integer when it comes to signed integer it fails to order it.

        // Set<Integer> t = new TreeSet<Integer>();  //In this they are in ordered fashion.

        t.add(1);
        t.add(3);
        t.add(1);
        t.add(5);
        t.add(-2);
        System.out.println("Before removal: " + t);

        //Set works really fast specially when we are looking for elemenets.
        boolean result = t.contains(3);

        // Remove an element from the set.
        t.remove(1);

        // To check if the set is empty or not.
        boolean empty = t.isEmpty();

        //To get the size of the set.
        int size = t.size();

        //To clear a set or remove every element from the set.
        t.clear();

        System.out.println("Set after removal of 1: " + t);
        System.out.println("3 is present or not in set: " + result);
        System.out.println("Set is empty: " + empty);
        System.out.println("Set size: " + size);
        System.out.println("After clearing set: " + t);
        
    }
}
