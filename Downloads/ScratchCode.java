import java.util.Scanner;
public class WeeklyStudyTracker
{
    // John Nguyen 1002097443 //
    // These constants define the size of the study tracker and the weekly goal. //
    private static final int NUM_SESSIONS = 5;
    private static final int RECOMMENDED_WEEKLY_MINUTES = 600;

    public static void main(String[] args)
    {
        Scanner toolScanner = new Scanner(System.in); // Create a Scanner object to read user input //
        boolean keepRunning = true; // Boolean flag to control the main loop //
        boolean studyTimesEntered = false; // Boolean flag to check if study times have been entered //
        int[] studyTimes = new int[NUM_SESSIONS]; // Array to hold the study times for each session //
        while (keepRunning)
        {
            System.out.println("===== WEEKLY STUDY TRACKER MENU =====");

            System.out.println("Enter 1 to enter / update study time");

            System.out.println("Enter 2 to view study sessions");

            System.out.println("Enter 3 to view weekly summary");

            System.out.println("Enter 4 to exit");
        
            System.out.println();
        }
    }
}