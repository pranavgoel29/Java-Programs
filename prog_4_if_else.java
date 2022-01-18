import java.util.Scanner;

public class prog_4_if_else {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if(s.equals("pranav") || s.equals("Pranav"))
        {
            System.out.println("Hello, Inside if block.");
        }
        else
        {
            System.out.println("In else block.");
        }

        System.out.println("outside if block.");
    }
}
