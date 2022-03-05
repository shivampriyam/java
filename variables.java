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
        
        // underscore in between numbers is allowed
        // int: 4 bytes -> 32 bits -> -2,147,483,648 to 2,147,483,647
        int d = 50_000;     System.out.println(d);

        // for small numbers short -> 2 bytes -> 16 bits -> -32768 to 32767
        short s = 11112;

        // for very small numbers byte -> 1 byte -> 8 bits -> -128 to 127
        byte b1 = 2;

        // for large number long -> 8 bytes
        long l = 5l;

        // doubles -> 8 bytes
        double percent = 2.2;

        // float 4 bytes => use f at the end of the numbers
        float percent1 = 3.3f;

        // char: 
        char c1 = 'A';
        c1 = 66;
        // c1 will print 'B' because 66 is the ascii value for B 
        // American Standard Code for Information Interchange

        // double supports int value also but will give output in double: done implicitly
        double d1 = 5; // implicit conversion

        // double number can be stored in int after casting : done explicitly
        int d2 = (int)5.5;      //type casting, Explicit conversion

    }
}
