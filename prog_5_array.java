
public class prog_5_array {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        int[] num_array = {1,2,3,4,5};          // Declaring an array of type 'int' named 'num_array' with prestored elements.
        int a = num_array[1];                   // Taking variable 'a' as element in array 'num_array' index 1.

        System.out.println(a);                  // printing the value of variable a.
    }
}
