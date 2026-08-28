import java.util.Scanner;
public class WeeklyStudyTracker
{
    // John Nguyen 1002097443 //
    // These constants define the size of the study tracker and the weekly goal. //
    private static final int NUM_SESSIONS = 5;
    private static final int RECOMMENDED_WEEKLY_MINUTES = 600;

    public static void main(String[] args)
    {
        // We'll come back to this //
    }
}
Write a program that allows a student to track the amount of time
they spend studying for a course during five study sessions.
The user should enter basic student and course information and then
use a menu to:
• Enter or update study times
• View study times
• View a weekly study summary
• Exit the program
The program should calculate the student's total and average study
time, convert the total number of minutes into hours and remaining
minutes, and determine a weekly study level.
Requirements:
○ Constants and Variables. (5 pts)
    • The recommended weekly study-time constant must be used when determining whether the student's study level is Excellent.
    • Constant names should follow Java naming conventions.
    • Use appropriate variable types throughout the program.
○ Student and Course Information. (10 pts)
The program must ask the user to enter:
    • Student name
    • Course name
The program must use String operations to:
    • Convert the student's name to uppercase for display.
    • Retrieve the first character of the student's name.
    • Create a three-character course code using the first three characters of the course name.
    • Convert the course code to uppercase.
You may assume that the student's name contains at least one character and the course name contains at least three characters.
For example:
Enter student name: Alex Smith
Enter course name: Programming Languages
The program should be able to produce:
Student: ALEX SMITH
Initial: A
Course: Programming Languages
Course Code: PRO
○ Study-Time Array. (10 pts)
    • Create an integer array capable of storing the study time for 5 study sessions.
    • Each value represents the number of minutes the student studied during one session.
    • The program must use the array to store and retrieve study-time information.
For example:
Session 1: 90 minutes
Session 2: 120 minutes
Session 3: 75 minutes
Session 4: 150 minutes
Session 5: 105 minutes
○ Menu and Program Loop. (10 pts)
After the student and course information has been entered, the program must repeatedly display a menu similar to:
===== WEEKLY STUDY TRACKER =====
Enter 1 to enter / update study time
Enter 2 to view study sessions
Enter 3 to view weekly summary
Enter 4 to exit
    • Use a while loop to allow the user to perform any number of the required operations.
    • The user must be able to choose when to terminate the program.
    • Use a boolean variable to control whether the program continues running.
○ Entering / Updating Study Time. (10 pts)
If the user selects 1:
    • Use a for loop to ask the user to enter the study time for all five sessions.
    • Store each value in the study-time array.
    • If study times were previously entered, the newly entered values should replace the previous values.
    • Use a boolean variable to keep track of whether study times have been entered.
For example:
Enter minutes for Session 1:
90
Enter minutes for Session 2:
120
Enter minutes for Session 3:
75
Enter minutes for Session 4:
150
Enter minutes for Session 5:
105
Study times saved successfully.
○ Viewing Study Sessions. (10 pts)
If the user selects 2:
    • Use a for loop to display all five study sessions and their study times.
For example:
------ STUDY SESSIONS ------
Session 1: 90 minutes
Session 2: 120 minutes
Session 3: 75 minutes
Session 4: 150 minutes
Session 5: 105 minutes
If study times have not yet been entered, the program should display
an appropriate message.
For example:
Please enter the study times first.
○ Weekly Study Summary. (20 pts)
If the user selects 3, the program must calculate and display a weekly study summary.
If study times have not yet been entered, the program should display:
Please enter the study times first.
Otherwise, the summary must include the following information.
Total Study Time
    Use a for loop to calculate the total number of minutes stored in the study-time array.
For example:
Total Study Time: 540 minutes
Average Study Time
Calculate the average amount of study time per session.
The calculation must use floating-point division so that decimal
values are preserved.
Use formatted output to display the average with two digits after the
decimal point.
For example:
Average per Session: 108.00 minutes
Hours and Remaining Minutes
Convert the total number of study minutes into hours and remaining
minutes.
Use integer division to calculate the number of complete hours.
Use the modulus operator (%) to calculate the remaining minutes.
For example:
565 minutes
should produce:
9 hours and 25 minutes
Study Level
Use an if / else if / else branching structure to determine the
student's weekly study level.
Use the following rules:
600 minutes or more Excellent
450–599 minutes On Track
300–449 minutes Making Progress
Less than 300 minutes More Study Time Recommended
The constant representing the recommended weekly study time must be
used in the condition for the Excellent level rather than directly
using the value 600.
The summary should contain all major student, course, and study
information.
For example:
------ WEEKLY STUDY SUMMARY ------
Student: ALEX SMITH
Initial: A
Course: Programming Languages
Course Code: PRO
Session 1: 90 minutes
Session 2: 120 minutes
Session 3: 75 minutes
Session 4: 150 minutes
Session 5: 105 minutes
Total Study Time: 540 minutes
Study Time: 9 hours and 0 minutes
Average per Session: 108.00 minutes
Study Level: On Track
○ Exit and Invalid Menu Choices. (5 pts)
If the user selects 4, terminate the program and display an
appropriate goodbye message.
For example:
Thank you for using the Weekly Study Tracker!
If the user enters an invalid menu option, display an appropriate
error message.
For example:
Invalid choice. Please enter 1-4.
The program should then display the menu again.
Input Assumptions
For this homework:
• You may assume that the user enters the expected data type for
each prompt.
• You do not need to handle input type mismatches.
• You may assume that all study times are entered as nonnegative
integers.
• You may assume that the student's name contains at least one
character.
• You may assume that the course name contains at least three
characters.
• Coding Style. (10 pts)
○ Readable Code. (10 pts)
• Use meaningful identifiers for variables and constants.
• Use proper indentation.
• Statements inside loops and branching statements should be
clearly indented.
• Use whitespace appropriately to make the program easy to read.
• Organize related sections of the program logically.
• Follow standard Java naming conventions.
All the above must apply for full credit.
• Comments. (10 pts)
• Include your name in the source code file. (5 pts)
• Include at least 5 meaningful comments in addition to your
name. (5 pts)
• Comments should describe the purpose or function of the code
near them.
Example Dialog:The following Example Dialog demonstrates the interactions between a
user and ONE possible implementation of the required software's
front-end / user interface. The software's front-end / user interface
may be implemented in MANY different ways and will receive full
credit as long as it meets the minimum requirements described above.
While you may use the example dialog as a guide, you are encouraged
to organize the interface in your own way.
Welcome to the Weekly Study Tracker!
Enter student name:
Alex Smith
Enter course name:
Programming Languages
===== WEEKLY STUDY TRACKER =====
Enter 1 to enter / update study time
Enter 2 to view study sessions
Enter 3 to view weekly summary
Enter 4 to exit
1
Enter minutes for Session 1:
90
Enter minutes for Session 2:
120
Enter minutes for Session 3:
75
Enter minutes for Session 4:
150
Enter minutes for Session 5:
105
Study times saved successfully.
===== WEEKLY STUDY TRACKER =====
Enter 1 to enter / update study time
Enter 2 to view study sessions
Enter 3 to view weekly summary
Enter 4 to exit
2
------ STUDY SESSIONS ------
Session 1: 90 minutes
Session 2: 120 minutes
Session 3: 75 minutes
Session 4: 150 minutes
Session 5: 105 minutes
===== WEEKLY STUDY TRACKER =====
Enter 1 to enter / update study time
Enter 2 to view study sessions
Enter 3 to view weekly summary
Enter 4 to exit
3
------ WEEKLY STUDY SUMMARY ------
Student: ALEX SMITH
Initial: A
Course: Programming Languages
Course Code: PRO
Session 1: 90 minutes
Session 2: 120 minutes
Session 3: 75 minutes
Session 4: 150 minutes
Session 5: 105 minutes
Total Study Time: 540 minutes
Study Time: 9 hours and 0 minutes
Average per Session: 108.00 minutes
Study Level: On Track
===== WEEKLY STUDY TRACKER =====
Enter 1 to enter / update study time
Enter 2 to view study sessions
Enter 3 to view weekly summary
Enter 4 to exit
4
Thank you for using the Weekly Study Tracker! //