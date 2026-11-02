
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner pipe = new Scanner(System.in);

        // Task 1: Declare an array with 100 integers
        int[] dataPoints = new int[100];


        // Task 2: Fill the array with random numbers between 1 and 100
        Random rnd = new Random();

        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }


        // Task 3: Display all values in the array
        System.out.println("The values in dataPoints are:");

        for (int i = 0; i < dataPoints.length; i++)
        {
            System.out.print(dataPoints[i]);

            if (i < dataPoints.length - 1)
            {
                System.out.print(" | ");
            }
        }

        System.out.println();


        // Task 4: Calculate the sum and average
        int sum = 0;

        for (int i = 0; i < dataPoints.length; i++)
        {
            sum += dataPoints[i];
        }

        double average = (double) sum / dataPoints.length;

        System.out.println("The sum of dataPoints is: " + sum);
        System.out.println("The average of dataPoints is: " + average);


        // Task 5: Ask the user for a number between 1 and 100
        int userValue = SafeInput.getRangedInt(pipe,
                "Enter a number to search for", 1, 100);


        // Task 6: Count how many times the number appears
        int count = 0;

        for (int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] == userValue)
            {
                count++;
            }
        }

        System.out.println("The value " + userValue +
                " was found " + count + " times in dataPoints.");


        // Task 7: Find the first position of a number
        int searchValue = SafeInput.getRangedInt(pipe,
                "Enter another number to find its first position", 1, 100);

        boolean found = false;

        for (int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] == searchValue)
            {
                System.out.println("The value " + searchValue +
                        " was found at array index " + i + ".");

                found = true;
                break;
            }
        }

        if (!found)
        {
            System.out.println("The value " + searchValue +
                    " was not found in the array.");
        }


        // Task 8: Find the minimum and maximum values
        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int i = 1; i < dataPoints.length; i++)
        {
            if (dataPoints[i] < min)
            {
                min = dataPoints[i];
            }

            if (dataPoints[i] > max)
            {
                max = dataPoints[i];
            }
        }

        System.out.println("The minimum value in dataPoints is: " + min);
        System.out.println("The maximum value in dataPoints is: " + max);


        // Task 9: Call the getAverage method
        System.out.println("Average of dataPoints is: " +
                getAverage(dataPoints));

        pipe.close();
    }


    // Task 9: Calculate the average of an integer array
    public static double getAverage(int values[])
    {
        int sum = 0;

        for (int i = 0; i < values.length; i++)
        {
            sum += values[i];
        }

        return (double) sum / values.length;
    }
}
