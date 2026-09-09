import java.util.Scanner; // Import the Scanner class to read user input //
// John Nguyen 1002097443 //
public class RectangleSorting
{
    public static void main(String[] args)
    {
        Scanner scanningTool = new Scanner(System.in); // Create a Scanner object to read user input //

        boolean runningProgram = true; // Boolean flag to control the main loop //

        boolean rectangleDataEntered = false; // Boolean flag to check if rectangle data has been entered //
        
        System.out.println("Welcome to the Rectangle Sorting Program!");

        System.out.println();

        while (runningProgram)
        {
            System.out.println("How many Rectangles are we creating?"); // Prompt the user to enter the number of rectangles they want to create //
            displayMenu(); // Call the displayMenu method to show the menu options to the user //

            int choice = scanningTool.nextInt(); // Read the user's menu choice //

            if (choice == 1) // The loop if the user chooses 1 to sort rectangles by smallest to largest //
            {
                if(!rectangleDataEntered)
                {
                    System.out.println("Please enter rectangle data first.");
                }
                else
                {
                    sortFromSmallestToLargest(); // We need a function right here that will sort the rectangles by area in ascending order and display the sorted list. //
                }
            }
            else if (choice == 2) // The loop if the user chooses 2 to sort rectangles by largest to smallest //
            {
                if(!rectangleDataEntered)
                {
                    System.out.println("Please enter rectangle data first.");
                }
                else
                {
                    sortFromLargestToSmallest(); // We need a function right here that will sort the rectangles by area in descending order and display the sorted list. //
                }
            }
            else if (choice == 3) // The loop if the user chooses 3 to get maximum area //
            {
                if(!rectangleDataEntered)
                {
                    System.out.println("Please enter rectangle data first.");
                }
                else
                {
                    getMaxArea(); // We need a function right here that will find and display the rectangle with the maximum area. //
                }
            }
            else if (choice == 4) // The loop if the user chooses 4 to get minimum area //
            {
                if(!rectangleDataEntered)
                {
                    System.out.println("Please enter rectangle data first.");
                }
                else
                {
                    getMinArea(); // We need a function right here that will find and display the rectangle with the minimum area. //
                }
            }
            else if (choice == 5) // The loop if the user chooses 5 to get average area //
            {
                if(!rectangleDataEntered)
                {
                    System.out.println("Please enter rectangle data first.");
                }
                else
                {
                    getAverageArea(); // We need a function right here that will calculate and display the average area of all rectangles. //
                }
            }
            else if (choice == 9) // The loop if the user chooses 9 to reenter rectangle data //
            {
                enterRectangleData(); // We need a function right here that will allow the user to reenter rectangle data and store it in the rectangles array. //
            }
            else if (choice == 0) // The loop if the user chooses 0 to exit the program //
            {
                runningProgram = false; // Set the flag to false to exit the main loop //

                System.out.println("Goodbye!"); // Display a goodbye message before exiting //
            }
            else // The loop if the user enters an invalid choice //
            {
                System.out.println("Invalid choice."); // Display an error message for invalid input //
            }
        }

        scanningTool.close(); // Close the Scanner object to free up resources //
    }

    public static void displayMenu() // Method to display the menu options to the user //
    {
        System.out.println(); // Display a blank line for better readability //
        System.out.println("Choose from the following:"); // Display the menu options //
        System.out.println("1. Sort Rectangles by Smallest to Largest");
        System.out.println("2. Sort Rectangles by Largest to Smallest");
        System.out.println("3. Get Maximum Area");
        System.out.println("4. Get Minimum Area");
        System.out.println("5. Get Average Area");
        System.out.println("9. Reenter Rectangle Data");
        System.out.println("0. To Quit");
    }
    
    private static class RectangleDimensions
    {
        private double length; // Variable to hold the length of the rectangle //
        private double width; // Variable to hold the width of the rectangle //
        RectangleDimensions(double length, double width) // Constructor to initialize the rectangle dimensions //
        {
            this.length = length; // Set the length of the rectangle //
            this.width = width; // Set the width of the rectangle //
        }
        double getArea() // Method to get the area of the rectangle //
        {
            return length * width; // Return the area of the rectangle //
        }
    }
    public static void sortFromSmallestToLargest(int Area[], int n) // Method to sort the rectangles by area in ascending order and display the sorted list using Insertion Sort //
    {
        int i;
        int j;
        int key;
        // Loop through each rectangle in the rectangles array //
        for (i = 1; i < n; i++) // Loop through each rectangle in the rectangles array starting from the second element //
        {
            key = Area[i]; // Store the area of the current rectangle in the key variable //
            j = i - 1; // Set j to the index of the previous rectangle //

            while (j >= 0 && Area[j] > key) // While j is greater than or equal to 0 and the area of the rectangle at index j is greater than the key //
            {
                Area[j + 1] = Area[j]; // Move the area of the rectangle at index j to index j + 1 //
                j = j - 1; // Decrement j to move to the previous rectangle //
            }
            Area[j + 1] = key; // Insert the key at index j + 1 //
        }

    }
    public static void sortFromLargestToSmallest(int Area[], int n) // Method to sort the rectangles by area in descending order and display the sorted list with Insertion Sort //
    {
        int i;
        int j;
        int key;
        // Loop through each rectangle in the rectangles array //
        for (i = 1; i < n; i++) // Loop through each rectangle in the rectangles array starting from the second element //
        {
            key = Area[i]; // Store the area of the current rectangle in the key variable //
            j = i - 1; // Set j to the index of the previous rectangle //

            while (j >= 0 && Area[j] < key) // While j is greater than or equal to 0 and the area of the rectangle at index j is less than the key //
            {
                Area[j + 1] = Area[j]; // Move the area of the rectangle at index j to index j + 1 //
                j = j - 1; // Decrement j to move to the previous rectangle //
            }
            Area[j + 1] = key; // Insert the key at index j + 1 //
        }
    }
    public static void getMaxArea() // The ability to display the maximum area of the rectangles provided and choose the largest one
    {
        int index; // Variable to hold the index of the rectangle with the maximum area //
        double max = rectangles[0].getArea(); // Variable to hold the maximum area of the rectangles provided //
        for (index = 1; index < rectangles.length; index++) // Loop through each rectangle in the rectangles array //
        {
            if (rectangles[index].getArea() > max) // Check if the area of the current rectangle is greater than the maximum area found so far //
            {
                max = rectangles[index].getArea(); // Update the maximum area if a larger area is found //
            }
        }
        System.out.println("The Maximum Area is " + max); // Display the maximum area of the rectangles provided //
    }
    public static void getMinArea() // The ability to display the minimum area of the rectangles provided and choose the smallest one
    {
        int index; // Variable to hold the index of the rectangle with the minimum area //
        double min = rectangles[0].getArea(); // Variable to hold the minimum area of the rectangles provided //
        for (index = 1; index < rectangles.length; index++) // Loop through each rectangle in the rectangles array //
        {
            if (rectangles[index].getArea() < min) // Check if the area of the current rectangle is less than the minimum area found so far //
            {
                min = rectangles[index].getArea(); // Update the minimum area if a smaller area is found //
            }
        }
        System.out.println("The Minimum Area is " + min); // Display the minimum area of the rectangles provided //
    }
    public static void getAverageArea() // Method to calculate and display the average area of the rectangles provided //
    {
        int i; // Variable to hold the index of the rectangle in the rectangles array //
        double totalArea = 0.0; // Variable to hold the total area of the rectangles //
        double averageArea; // Variable to hold the average area of the rectangles //
        for (i = 0; i < rectangles.quantity; i++) // Loop through each rectangle in the rectangles array //
        {
            totalArea += rectangles[i].getArea(); // Add the area of the current rectangle to the total area //
        }
        averageArea = totalArea / rectangles.quantity; // Calculate the average area of the rectangles provided //
        System.out.println("The Average Area is " + averageArea); // Display the average area of the rectangles provided //
    }
    public static void enterRectangleData() // Method to allow the user to enter rectangle data and store it in the rectangles array //
    {
        System.out.println("Enter the number of Rectangles you want to create: "); // Prompt the user to enter the number of rectangles they want to create //
        if (rectangles.quantity <= 0) // Check if the number of rectangles is less than or equal to 0 //
        {
            System.out.println("Please enter a positive number of rectangles."); // Display an error message for invalid input //
        }
        else
        {
            rectangles = new RectangleDimensions[rectangles.quantity]; // Create a new array of RectangleDimensions objects with the specified quantity //
            int quantity = rectangles.quantity; // Store the quantity of rectangles in a variable for later use //u
            for (quantity = 0; quantity < rectangles.quantity; quantity++) // Loop through each rectangle in the rectangles array //
            {
                System.out.println("Enter the length for Rectangle " + quantity + ": "); // Prompt the user to enter the length of the current rectangle //
                double length = toolScanner.nextDouble(); // Read the length of the current rectangle from user input //
                System.out.println("Enter the width for Rectangle " + quantity + ": "); // Prompt the user to enter the width of the current rectangle //
                double width = toolScanner.nextDouble(); // Read the width of the current rectangle from user input //
                rectangles[quantity] = new RectangleDimensions(length, width); // Create a new RectangleDimensions object with the specified length and width and store it in the rectangles array at the current index //
            }
            System.out.println("Rectangle data saved successfully."); // Display a success message after saving the rectangle data //
        }
    }
}