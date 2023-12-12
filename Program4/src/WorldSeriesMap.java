import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

//********************************************************************
//
//  Developer:    Austin Riggs
//
//  Project #:    Four
//
//  File Name:    WorldSeriesMap.java
//
//  Course:       ITSE 2317 Intermediate Java Programming
//
//  Due Date:     6/29/2023
//
//  Instructor:   Prof. Fred Kumi
//
//  Description:  Program used to create two map objects using
//                World Series file. yearWinner Hashmap contains
//                map of years of World Series as its key and the
//                name of the team that won that year. numberOfWins
//                map contains name of team as its key and number of
//                wins a given team has won the World Series in
//                history.
//
//
//********************************************************************
public class WorldSeriesMap
{
    // yearWinner variable, key is year won and value is team name
    private Map<String, String> yearWinner;
    // numberOfWins variable, key is team name and value is number of total wins for team
    private Map<String, Integer> numberOfWins;
    // boolean flag used to determine if file has been loaded into program
    private boolean loaded;


   // default constructor used to set method variables to default values of null or false


   //***************************************************************
   //
   //  Method:       loadFile
   //
   //  Description:  takes name of file as argument, loads file
   //                and converts information into two Hashmaps.
   //
   //  Parameters:   String
   //
   //  Returns:      N/A
   //
   //**************************************************************
    public void loadFile(String fileName)
    {
        // global Map variables initialized
        yearWinner = new HashMap<>();
        numberOfWins = new HashMap<>();

        // attempts to open file with given file name, scanner created
        try(Scanner reader = new Scanner(Paths.get(fileName)))
        {
            // first year of World Series
            int year = 1903;

            // loops until file no longer has additional information
            while(reader.hasNextLine())
            {
                String team = reader.nextLine();

                // if team name key already exists
                if(numberOfWins.containsKey(team))
                {
                    // value incremented by 1
                    numberOfWins.put(team, numberOfWins.get(team) + 1);
                }
                // creates new map entry
                else
                {
                    numberOfWins.put(team, 1);
                }

                // years World Series was not played
                if (year == 1904 | year ==1994)
                {
                    // converts year int to String to use as key, "N/A" for value
                    yearWinner.put(Integer.toString(year), "N/A");
                    // year incremented by 1 so current team being read is added to following year
                    year++;
                }

                // converts year int to String to use as key, String team name for value
                yearWinner.put(Integer.toString(year), team);
                // year value incremented by 1
                year++;


            }
            // file has successfully loaded, flag set to "true"
            loaded = true;


        }
        // error handling
        catch (NoSuchElementException | IllegalStateException |
                IOException e)
        {
            System.err.printf("Error processing file. Please ensure that the name of the " +
                    "file you entered is correct.%n%n");

        }

    } // end loadMap

    //***************************************************************
    //
    //  Method:       searchMap
    //
    //  Description:  Asks user to input number between valid
    //                World Series years or 0 to exit program.
    //                Prints winning team for year and number
    //                of times team has won in history.
    //
    //  Parameters:   String
    //
    //  Returns:      N/A
    //
    //**************************************************************
    public void searchMap()
    {
        // checks if file has been uploaded to program
        if(loaded)
        {
            // sentinel used for while loop
            boolean searching = true;
            Scanner scanner = new Scanner(System.in);

            while (searching)
            {
                try
                {
                    System.out.println("Please enter a number between 1903 to 2022" +
                            " to find\nthe World Series winner for that year or enter \"0\" to exit program ");
                    String input = scanner.nextLine();

                    // checks for user input of "0"
                    if (input.equals("0"))
                    {
                        // while loop ends
                        searching = false;
                    }
                    // checks if year is valid
                    else if (yearWinner.containsKey(input))
                    {
                        // special case handling
                        if (input.equals("1904") | input.equals("1994"))
                        {
                            System.out.printf("No World Series was played in %s.%n%n", input);
                        }
                        // prints team winner and number of total wins for team to user
                        else
                        {
                            // holds team name
                            String team = yearWinner.get(input);
                            // holds value of "time" or "times"
                            String timeOrTimes;
                            // holds total number of wins
                            int wins = numberOfWins.get(team);


                            // prints year value and team name value
                            System.out.printf("The World series winner in %s were the %s%n",
                                    input, team);

                           // prints team and total number of wins
                            System.out.printf("The %s have won the World Series %s %s in history.%n%n",
                                    team, wins, wins > 1 ? "times" : "time");
                        }


                    }
                    // user did not input valid year
                    else
                    {
                        System.out.printf("Nothing was found. Please enter a number between 1903 to 2022%n" +
                                "or enter \"0\" to exit the program.%n%n");
                    }

                }
                // error handling
                catch (Exception e)
                {
                    System.out.printf("An error has occurred: %s%n%n", e.getMessage());
                }
            }

        }
        // informs user file was not uploaded correctly and no search can be done.
        else
        {
            System.out.printf("Error: Failed to upload file. Please upload the correct file.%n%n");
        }
    } // end searchMap

    //***************************************************************
    //
    //  Method:       printMap
    //
    //  Description:  Method used to print out contents of map to
    //                user.
    //
    //  Parameters:   N/A
    //
    //  Returns:      N/A
    //
    //**************************************************************
    public void printMap()
    {
        // if file was uploaded
        if(loaded)
        {
            // sorts keys in ascending order
            Set<String> sortedKeys = new TreeSet<>(yearWinner.keySet());

            // output header
            System.out.printf((String.format("%n%-10s%-25s%s%n","Year","Team","Total World Series Wins")));

            for(String key: sortedKeys)
            {
                String team = yearWinner.get(key);

                // checks for years with no World Series, prints special case
                if(team.equals("N/A"))
                {
                    System.out.printf(String.format("%-10s%-25s%s%n",key,team,"N/A"));
                }
                // prints contents normally
                else
                {

                    Integer wins = numberOfWins.get(team);
                    System.out.printf(String.format("%-10s%-25s%s%n",key,team,wins));
                }
            }
        }
        // informs user that object is empty
        else
        {
            System.out.printf("Object is empty.%n");
        }

        System.out.printf("%n%n");

    } // end printMap

} // end class WorldSeriesMap
