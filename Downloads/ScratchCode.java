import java.util.Scanner;
public class ScratchCode
{
    // John Nguyen 1002097443 //
    // These constants define the size of the study tracker and the weekly goal. //
    private static final int NUMBER_OF_SESSIONS = 5;
    private static final int RECOMMENDED_WEEKLY_MINUTES = 600;

    public static void main(String[] args)
    {
        Scanner toolScanner = new Scanner(System.in); // Create a Scanner object to read user input //

        boolean keepRunning = true; // Boolean flag to control the main loop //

        boolean studyTimesEntered = false; // Boolean flag to check if study times have been entered //

        int[] studyTimes = new int[NUMBER_OF_SESSIONS]; // Array to hold the study times for each session //

        while (keepRunning)
        {
            System.out.println("===== WEEKLY STUDY TRACKER MENU =====");

            System.out.println("Enter 1 to enter / update study time");

            System.out.println("Enter 2 to view study sessions");

            System.out.println("Enter 3 to view weekly summary");

            System.out.println("Enter 4 to exit");
        
            System.out.println();

            int choice = toolScanner.nextInt(); // Read the user's menu choice //

            if (choice == 1) // The loop if the user chooses 1 to enter their study time //
            {
                for (int i = 0; i < NUMBER_OF_SESSIONS; i++) // We use a for loop to iterate through the studyTimes array and prompt the user to enter study times for each session //
                {
                    System.out.println("Enter minutes for Session " + (i + 1) + ":"); // We use +1 to display the session number starting from 1 instead of 0 and it goes before the colon //

                    studyTimes[i] = toolScanner.nextInt(); // We store the user input into the studyTimes array at the current index for later use //

                    System.out.println();
                }

                studyTimesEntered = true; // Set the flag to true to indicate that study times have been entered //
                System.out.println("Study times saved successfully.");
                System.out.println();
            }
            
            else if (choice == 2) // The loop if the user chooses 2 to view their study sessions //
            {
                if (!studyTimesEntered) // Check if study times have been entered before displaying them //
                {
                    System.out.println("Please enter the study times first.");

                    System.out.println();
                }
                else
                {
                    System.out.println("------ Study Sessions ------");
                    for (int i = 0; i < NUMBER_OF_SESSIONS; i++) // We use a for loop to iterate through the studyTimes array and display the study times for each session //
                    {
                        System.out.println("Session " + (i + 1) + ": " + studyTimes[i] + " minutes"); // We use +1 to display the session number starting from 1 instead of 0 and it goes before the colon //
                    }
                    System.out.println();
                }
            }

            else if (choice == 3)
            {
                // ("------ WEEKLY STUDY SUMMARY ------");
                // ("Student: ALEX SMITH");
                // ("Initial: A");
                //("Course: Programming Languages");
                // ("Course Code: PRO");
                // Session 1: 90 minutes
                // Session 2: 120 minutes
                // Session 3: 100 minutes
                // Session 4: 80 minutes
                // Session 5: 110 minutes

                // Total Study Time: 500 minutes
                // Study Time: 9 hours and 0 minutes
                // Average per Session: 100.00 minutes
                // Study Level: On Track
            }
            
            else if (choice == 4)
            {
                keepRunning = false; // Set the flag to false to exit the main loop and end the program //

                System.out.println("Thank you for using the Weekly Study Tracker!");
            }

            else // The loop if the user presses any other number besides 1, 2, 3, or 4 //
            {
            System.out.println("Invalid choice. Please enter 1-4.");

            System.out.println();
            }
        
        }

        toolScanner.close(); // Close the scanner to prevent memory leaks //

    }

}