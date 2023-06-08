package task2;
import java.util.Random;

public class task2 {
	 //constants
    private static final int LENGTH = 5;
    private static final int MAX_PRICE = 10000;

    //Create a string variable called "make" and initialize it with "Toyota".
    private static String make = "Toyota";

    //Create a wrapper class variable called "year" and initialize it with 2023.
    private static Integer year = 2023;

    static int[] prices = new int[LENGTH];

    /* Create a main method in which you call the "displayInfo" method and the "findMaxPrice" and
    "findMinPrice" methods */
    public static void main(String[] args) {
        displayInfo();
        System.out.println("Max price: " + findMaxPrice());
        System.out.println("Min price: " + findMinPrice());
    }

    //Create an array of 5 elements of type int, with the name "prices" and initialize the array with
    //random int values between 0 and 10000 (inclusive)
    public static int[] generatePrices() {
        Random random = new Random();
        for (int i = 0; i < LENGTH; i++) {
            prices[i] = random.nextInt(MAX_PRICE);
        }
        return prices;
    }

    /* Create a method called "displayInfo" that takes no parameters and returns no value. Inside the
    method, do the following */
    public static void displayInfo() {
        //Print out the contents of the "prices" array
        int[] prices = generatePrices();
        for (int i = 0; i < LENGTH; i++) {
            System.out.println(prices[i]);
        }

        //Print out the total price of all the elements in the "prices" array
        int totalPrice = 0;
        for (int i = 0; i < LENGTH; i++) {
            totalPrice += prices[i];
        }
        System.out.println("Total Price: " + totalPrice);

        //Print out the average price of all the elements in the "prices" array
        double averagePrice = totalPrice / (double) LENGTH;
        System.out.println("Average Price: " + averagePrice);

        //Print out the make and year variable
        System.out.println("make: " + make);
        System.out.println("year: " + year);
    }

    //Create a new method called "findMaxPrice" that takes no parameters and returns the
    //maximum value in the "prices" array
    public static int findMaxPrice() {
        int max = prices[0];
        for (int i = 1; i < LENGTH; i++) {
            if (max < prices[i]) {
                max = prices[i];
            }
        }
        return max;
    }

    //Create a new method called "findMinPrice" that takes no parameters and returns the minimum
    //value in the "prices" array
    public static int findMinPrice() {
        int min = prices[0];
        for (int i = 1; i < LENGTH; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
        }
        return min;
    }

}
