
import java.util.Scanner;

public class SafeInput
{
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int value;

        while (true)
        {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");

            if (pipe.hasNextInt())
            {
                value = pipe.nextInt();
                pipe.nextLine();

                if (value >= low && value <= high)
                {
                    return value;
                }
                else
                {
                    System.out.println("Number must be between " + low + " and " + high + ".");
                }
            }
            else
            {
                System.out.println("Invalid input. Enter an integer.");
                pipe.nextLine();
            }
        }
    }
}
