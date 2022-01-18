
public class prog_1{
    public static void main(String[] args){

        System.out.print("\033[H\033[2J");
        // Flushing out the remaining bytes
        System.out.flush();
        
        //working with variable

        int var1 = 1, var2 = 2;
        System.out.println(var1 + var2);
        
    }
}