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

        enterRectangleData(); // Call the enterRectangleData method to prompt the user to enter rectangle data //

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

    // The ability to keep track of how many rectangles have been created and display the total number of rectangles created.
    {
        // Keep track of how many rectangles have been created //
        // Display the total number of rectangles created //
    }
    // The ability to sort the rectangles based on their area in ascending order and display the sorted list of rectangles.
    {
        // Sort the rectangles based on their area in ascending order //
        // Display the sorted list of rectangles //
    }
    // The ability to display the maximum area of the rectangles provided and choose the largest one
    {
        // Display the maximum area of the rectangles provided //
        // Choose the largest rectangle based on area //
    }
    // The ability to display the minimum area of the rectangles provided and choose the smallest one
    {
        // Display the minimum area of the rectangles provided //
        // Choose the smallest rectangle based on area //
    }
    public static void getAverageArea() // Method to calculate and display the average area of the rectangles provided //
    {
        double totalArea = 0.0; // Variable to hold the total area of the rectangles //
        double averageArea; // Variable to hold the average area of the rectangles //
        for (RectangleDimensions rectangle : rectangles) // Loop through each rectangle in the rectangles array //
        {
            totalArea += rectangle.getArea(); // Add the area of the current rectangle to the total area //
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