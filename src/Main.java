import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int age = 0;
        String trash = "";

        System.out.print("Enter your age: ");

        if(console.hasNextInt())
        {
            age = console.nextInt();
            console.nextLine();
            if(age >= 21)
            {
                System.out.println("Here's your wristband!");
            }
        }
        else
        {
            trash = console.nextLine();
            System.out.println("You entered " + trash + " not an age!");
            System.out.println("Run the program again with correct input");
        }
    }
}