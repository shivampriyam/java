import java.util.Scanner;

public class variables {

    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);

        System.out.println("Enter a");
        int a = input1.nextInt();
        System.out.println("Enter b");
        int b = input1.nextInt();

        // Close the input_Scanner
        input1.close();

        int c = a - b;
        
        System.out.println("The value of c is: " + c);

        // Variable name can contain
        // number(not at first place), alphabet, string, underscore_ and $
    }
}
