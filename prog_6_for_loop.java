public class prog_6_for_loop {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        for(int i = 0; i<=10; i++)
        {
            System.out.println(i);
        }

        int[] arr = {1,2,3,4,5,6};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 2)
            {
                System.out.println("Found 2 at index " + i);
            }
            else
            {
                System.out.println("Didn't found 2 in the array at index " + i);
            }
        }
    }
}
