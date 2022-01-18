import java.util.Scanner;

public class prog_3_input {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner sc = new Scanner(System.in);
        
        // The below method will only work for the String datatype, if we want to take int as input then we have to define another function.
        String scanned = sc.next();                 //It will get the next stream of input from the user.

        int scanned2 = sc.nextInt();                // This will take input as an integer.

        int x = Integer.parseInt(scanned);          // Parsing the string into an integer. So we can avoid the crash when we write anything else in any other type of input, we will try to only use the string type input and then convert it acccording to our needs.

        System.out.println("Input as String: " + scanned);                // Here I am printing the input which we have stored in a variable named scanned.
        System.out.println("Input in INT form: " + scanned2);
        System.out.println("Converted String: " + x);
    
    }
}
