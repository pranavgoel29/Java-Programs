public class example{
    public static void main(String[] args){

       // The following line of code is used to clear the console, it uses the ANSI escape code 
       // \033 means ESC or the escape characte, 033 with [H, we can move the cursor to a specified position, 033[2J, cleans the whole screen.
       System.out.print("\033[H\033[2J");
       
       // Flushing out the remaining bytes
       System.out.flush();

       System.out.println("This is a simple java prog.");
    }
 }