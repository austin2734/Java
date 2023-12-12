//********************************************************************
//
//  Developer:    Austin Riggs
//
//  Project #:    Three
//
//  File Name:    DuplicateFinder.java
//
//  Course:       ITSE 2317 Intermediate Java Programming
//
//  Due Date:     6/23/2023
//
//  Instructor:   Prof. Fred Kumi
//
//  Description:  Program takes string input from user and displays
//                duplicate words and their frequency in the string.
//                Program loops until user inputs the word "no"
//
//
//********************************************************************

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class DuplicateFinder
{
    // default constructor used

    //***************************************************************
    //
    //  Method:       start
    //
    //  Description:  begins program and loops until user enters
    //                the word "no".
    //
    //  Parameters:   N/A
    //
    //  Returns:      N/A
    //
    //**************************************************************
    public void start()
    {
        // flag used to exit loop when user enters "no"
        boolean running = true;

        Scanner scanner = new Scanner(System.in);

        while (running)
        {
            try
            {

                    System.out.println("Please enter a string or enter the word \"no\" to exit the program: ");
                    String input = scanner.nextLine();

                    // equalsIgnoreCase ignores character case of input
                    if (input.equalsIgnoreCase("no"))
                    {
                        // ends program
                        running = false;
                    }
                    else
                    {
                        // tokenizeString method called
                        String[] tokens = tokenizeString(input);
                        // createMap method called
                        Map<String, Integer> wordMap = createMap(tokens);
                        // displayDuplicates method called
                        displayDuplicates(wordMap);
                    }
            }
            // catches any exception that may have occurred and prints error message.
            catch (Exception e)
            {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }

        scanner.close();

    } // end start

    //***************************************************************
    //
    //  Method:       tokenizeString
    //
    //  Description:  splits String into array of words and
    //                replaces all words with lowercase version of
    //                word.
    //
    //  Parameters:   String
    //
    //  Returns:      String[]
    //
    //**************************************************************
    private String[] tokenizeString(String userInput)
    {

        String[] tokens = userInput.split(" ");

        for (int i = 0; i < tokens.length; i++)
        {
            tokens[i] = tokens[i].toLowerCase();
        }

        return tokens;

    } // end tokenizeString

    //***************************************************************
    //
    //  Method:       createMap
    //
    //  Description:  creates HashMap from String[]
    //
    //  Parameters:   String[]
    //
    //  Returns:      Map<String, Integer>
    //
    //**************************************************************
    private Map<String, Integer> createMap(String[] words)
    {
       Map<String, Integer> map = new HashMap<>();

       for (String word: words)
       {
           // if word already exists in map, word value incremented by one;
           if(map.containsKey(word))
           {
               int count = map.get(word);
               map.put(word, count + 1);
           }
           // word added to map with value of one
           else
           {
               map.put(word, 1);
           }
       }

       return map;

    } // end createMap

    //***************************************************************
    //
    //  Method:       displayDuplicates
    //
    //  Description:  Iterates through map and prints words with
    //                values greater than one
    //
    //  Parameters:   Map<String, Integer>
    //
    //  Returns:      N/A
    //
    //**************************************************************
    private void displayDuplicates(Map<String, Integer> wordMap)
    {
        Set<String> keys = wordMap.keySet();

        // used to determine if any duplicates were found
        int count = 0;

        System.out.printf("%nDuplicates Found:%n%n");

        for (String key: keys)
        {
            if(wordMap.get(key) > 1)
            {
               System.out.printf("%-10s%10d%n", key, wordMap.get(key));
               count++;
            }

        }
        // if no duplicates were found, message is displayed to user
        if (count == 0)
        {
            System.out.println("No duplicate words found.");
        }

        System.out.println(" ");

    } // end displayDuplicates

    //***************************************************************
    //
    //  Method:       toString
    //
    //  Description:  overrides toString method
    //
    //  Parameters:   N/A
    //
    //  Returns:      String
    //
    //**************************************************************
    @Override
    public String toString()
    {
        return String.format("DuplicateFinder Object");

    } // end toString

} // end class DuplicateFinder
