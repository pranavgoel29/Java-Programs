public class prog_2_typecasting {
    public static void main (String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        int a = 3;
        int b = 2;
        float c = (float)b / a;                        //Here we are typecasting b as float so we can get the result accurately of this whole operation.
        System.out.println("Value of c: " + c);
    }
}
