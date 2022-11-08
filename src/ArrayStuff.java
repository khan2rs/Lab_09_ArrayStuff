import java.util.Random;
import java.util.Scanner;

public class ArrayStuff {
    public static void main(String[] args) {
        //Random rnd = new Random();
        //int val = rnd.nextInt(100);  // gives a value from 0 to 99
        //int val = rnd.nextInt(100) + 1;  // gives a value from 1 to 100
        //int index = rnd.nextInt(myArray.length);  gives a random valid index on myArray

        Random rnd = new Random();
//Declare an array of type int named dataPoints.
//dataPoints should have a length of 100. (i.e. it should hold 100 int values.)

        int[] dataPoints;
        dataPoints = new int[100];

        for (int i = 0; i < 100; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        for (int i = 0; i < 100; i++)
        {
            if (i != 99)
                System.out.print(dataPoints[i] + " | ");
            else
                System.out.println(dataPoints[i]);
        }
        System.out.println("");

        int sumOfData = 0;
        int averageData = 0 ;
        for (int i = 0; i < 100; i++)
        {
            sumOfData += dataPoints[i];
        }


        averageData = sumOfData / 100;
        System.out.println("The sum of the array dataPoints is: " + sumOfData);
        System.out.println("The average of the array dataPoints is: " + averageData);

//space?
        System.out.println("");

        Scanner in = new Scanner(System.in);
        int aNum = 0;

        aNum = SafeInputs.getRangedInt(in, "Please enter your number:", 1, 100);
        int times = 0;
        for (int i = 0; i < 100; i++)
        {
            if (dataPoints[i] == aNum)
                times++;
        }
        System.out.println("Your number " + aNum + " has appeared " + times + " times in the array.");
        System.out.println("");

        aNum = 0;
        aNum = SafeInputs.getRangedInt(in, "Enter your number", 1, 100);
        int pos = -1;
        for (int i = 0; i < 100; i++)
        {
            if (dataPoints[i] == aNum)
            {
                pos = i;
                break;
            }
        }
        if (pos != -1)
            System.out.println("Your number " + aNum + " was found at array index position " + pos + " in the array.");
        else
            System.out.println("Your number " + aNum + " was not found inside the array.");
        System.out.println("");

        int min = 100;
        int max = 0;
        for (int i = 0; i < 100; i++)
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
        System.out.println("The minimum number of the array is " + min);
        System.out.println("The maximum number of the array is " + max);
        System.out.println("");

        double[] doublePoints;
        doublePoints = new double[100];

        for (int i = 0; i < 100; i++)
        {
            doublePoints[i] = rnd.nextDouble() * 100;
        }

        for (int i = 0; i < 100; i++)
        {
            if (i != 99)
                System.out.print(doublePoints[i] + " | ");
            else
                System.out.println(doublePoints[i]);
        }
        System.out.println("");

        double averageDoubleData = getAverage(doublePoints);
        System.out.println("The average of the array is: " + averageDoubleData);
        System.out.println("");

        sumOfData = sum(dataPoints);
        System.out.println("The sum of the array is: " + sumOfData);
        System.out.println("");

        min = min(dataPoints);
        System.out.println("The minimum number of the array is: " + min);
        System.out.println("");

        max = max(dataPoints);
        System.out.println("The maximum number of the array is: " + max);
        System.out.println("");

        aNum = 0;
        aNum = SafeInputs.getRangedInt(in, "Enter your number", 1, 100);
        times = occurence(dataPoints, aNum);
        System.out.println("Your number " + aNum + " has appeared " + times + " times in the array.");
        System.out.println("");

        aNum = 0;
        aNum = SafeInputs.getRangedInt(in, "Enter your number:", 1, 100);
        pos = contains(dataPoints, aNum);
        if (pos != -1)
            System.out.println("Your number " + aNum + " was found at array index position " + pos + " of the array.");
        else
            System.out.println("Your number " + aNum + " was not found in the array.");
        System.out.println("");
    }


    //get average class
    //Write this static method which takes an array of double values and returns the
    //average and test it. Remember static methods go in the main java class file
    //immediately after the main method.
    public static double getAverage(double value[])
    {
        double sumData = 0;
        double averageData = 0 ;
        for (int i = 0; i < 100; i++)
        {
            sumData += value[i];
        }
        averageData = sumData / 100;
        System.out.println("The sum of the array dataPoints is : " + sumData);
        return averageData;
    }

    public static int min(int values[])
    {
        int min = 100;
        for (int i = 0; i < 100; i++)
        {
            if (values[i] < min)
            {
                min = values[i];
            }
        }
        return min;
    }

    public static int max(int values[])
    {
        int max = 0;
        for (int i = 0; i < 100; i++)
        {
            if (values[i] > max)
            {
                max = values[i];
            }
        }
        return max;
    }

    public static int sum(int values[])
    {
        int sumData = 0;
        for (int i = 0; i < 100; i++)
        {
            sumData += values[i];
        }
        return sumData;
    }

    public static int occurence(int values[], int target)
    {
        int times = 0;
        for (int i = 0; i < 100; i++)
        {
            if (values[i] == target)
                times++;
        }
        return times;
    }

    public static int contains(int values[], int target)
    {
        int pos = -1;
        for (int i = 0; i < 100; i++)
        {
            if (values[i] == target)
            {
                pos = i;
                break;
            }
        }
        return pos;
    }
}

        

