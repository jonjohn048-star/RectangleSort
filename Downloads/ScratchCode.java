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

        System.out.println("Welcome to the Weekly Study Tracker!"); // Display a welcome message //

        System.out.println("Enter student name:"); // Prompt the user to enter their name //
        
        String studentName = toolScanner.nextLine(); // Read the user's input for their name //

        String uppercaseStudentName = studentName.toUpperCase(); // Variable to hold the student's name in uppercase for display //

        char studentInitial = studentName.charAt(0); // Variable to hold the student's first initial for display //

        System.out.println("Enter course name:"); // Prompt the user to enter the course name //

        String courseChoice = toolScanner.nextLine(); // Variable to hold the course name for display //
        
        String courseCode = courseChoice.substring(0, 3).toUpperCase(); // Variable to hold the course code for display //

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
                        System.out.println("Session " + (i + 1) + ": " + studyTimes[i] + " minutes"); // We use +1 to display the session number starting from 1 instead of 0 and it goes before the colon AND we use the studyTimes function from choice 1 to display the study times //
                    }
                    System.out.println();
                }
            }

            else if (choice == 3) // The loop if the user chooses 3 to view their weekly summary //
            {
                if (!studyTimesEntered) // Check if study times have been entered before displaying the weekly summary //
                {
                    System.out.println("Please enter the study times first.");
                    System.out.println();
                }
                else
                {
                    int totalStudyTime = 0; // Variable to hold the total study time for the week //
                    for (int i = 0; i < NUMBER_OF_SESSIONS; i++) // We use a for loop to iterate through the 5 study sessions we calculated and calculate the total study time for the week //
                    {
                        totalStudyTime += studyTimes[i]; // We add the study time for each session to the totalStudyTime variable //
                    }
                    double averageStudyTime = (double) totalStudyTime / NUMBER_OF_SESSIONS; // We calculate the average study time per session by dividing the total study time by the number of sessions and we cast it to double to get a decimal value //
                    int hours = totalStudyTime / 60; // We calculate the number of hours by dividing the total study time by 60 //
                    int minutes = totalStudyTime % 60; // We calculate the number of minutes by using the modulus operator to get the remainder of the total study time divided by 60 //
                    String studyLevel; // Variable to hold the study level based on the total study time for the week //
                    if (totalStudyTime >= RECOMMENDED_WEEKLY_MINUTES)
                    {
                        studyLevel = "Excellent"; // If the total study time is greater than or equal to the recommended weekly minutes, the study level is Excellent //
                    }
                    else if (totalStudyTime >= 450)
                    {
                        studyLevel = "On Track";
                    }
                    else if (totalStudyTime >= 300)
                    {
                        studyLevel = "Needs Improvement";
                    }
                    else
                    {
                        studyLevel = "More Study Time Recommended";
                    }
                    System.out.println("------ WEEKLY STUDY SUMMARY ------");
                    System.out.println("Student: " + uppercaseStudentName);
                    System.out.println("Initial: " + studentInitial);
                    System.out.println("Course: " + courseChoice);
                    System.out.println("Course Code: " + courseCode);
                    System.out.println();

                    for (int i = 0; i < NUMBER_OF_SESSIONS; i++) // We use a for loop to iterate through the studyTimes array and display the study times for each session //
                    {
                        System.out.println("Session " + (i + 1) + ": " + studyTimes[i] + " minutes"); // We use +1 to display the session number starting from 1 instead of 0 and it goes before the colon AND we use the studyTimes function from choice 1 to display the study times //
                    }

                    System.out.println();
                    System.out.println("Total Study Time: " + totalStudyTime + " minutes");
                    System.out.println("Study Time: " + hours + " hours and " + minutes + " minutes");
                    System.out.printf("Average per Session: %.2f minutes%n", averageStudyTime); // We display the average study time per session with 2 decimal places //
                    System.out.println("Study Level: " + studyLevel); // We display the study level based on the total study time for the week //
                    System.out.println();
                }
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