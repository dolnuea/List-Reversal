import java.util.Scanner;

/**
 * @author Dolunay Dagci
 * CISS 111-360
 * Assignment: Ch16 1 List Reversal
 * Due Date: Sunday, March 31, 2019
 * This program takes an arbitrarily long string and reverses the order of its characters.
 */
public class DD_ListReversal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Create scanner for input
        System.out.println("Enter a string:"); //ask the user for string input
        String str = scanner.nextLine(); //get the input as a whole line
        while (str.isEmpty()) { //if user did not enter anything / simply pressed return without writing anything
        System.out.println("Error: NO INPUT FOUND!\nEnter an input please:"); //it asks the user to enter an input which is not empty
        str = scanner.nextLine();
    }
        System.out.println("You've entered: " + str); //it displays what user entered when user enters a non-empty string
        System.out.print("Reversed: "); //then shows the reversed form of the input
        reverseStr(str); //reverse the string
    }

    /**
     * Recursive method for reversing long strings.
     * @param str input from the user.
     */
    private static void reverseStr(String str)
    {
        if (str.length() == 0) return;
        else {
            System.out.print(str.charAt(str.length()-1)); //display the string in reversed form, reversing characters one by one
            reverseStr(str.substring(0,str.length()-1)); //reverse the whole input
            }
    }
}
