///////////////////////////////////////////////////////
// Author:   Quinn Trate
// Date:     September 10, 2023
// Class:    CMPSC 463 Algorithms
// Language: Java
// Purpose:  Inputs a String Which Acts as the
//           Alphabet. Generates all Words with
//           Letters in Reverse Alphabetical Order.
///////////////////////////////////////////////////////

import java.util.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Alphabet String:");
        String alphabet = scanner.nextLine();
        System.out.println("\nAll Words with Letters in Reverse Alphabetical Order:");
        ArrayList<String> result = generateStrings(alphabet);
        for (String s: result)
            System.out.print(s + '\n');
    }

    static ArrayList<String> generateStrings(String alphabet)
    {
        ArrayList<String> result = new ArrayList<>();
        String curr = "";
        helper(alphabet, curr, result);
        return result;
    }

    static void helper(String str, String curr, ArrayList<String> result)
    {
        if (str.isEmpty())
            return;
        char ch = str.charAt(0);
        result.add(reverseString(curr + ch));
        helper(str.substring(1), curr + ch, result);
        helper(str.substring(1), curr, result);
    }

    private static String reverseString(String temp)
    {
        StringBuilder reversed = new StringBuilder(temp);
        return reversed.reverse().toString();
    }
}
