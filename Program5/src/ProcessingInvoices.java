import java.util.*;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.function.Function;
import java.util.function.Predicate;

//********************************************************************
//
//  Developer:    Austin Riggs
//
//  Project #:    Five
//
//  File Name:    ProcessingInvoices.java
//
//  Course:       ITSE 2317 Intermediate Java Programming
//
//  Due Date:     7/15/2023
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
public class ProcessingInvoices
{
    // variable used to store invoices
    private ArrayList<Invoice> invoices;

    //***************************************************************
    //
    //  Method:       Constructor
    //
    //  Description:  Constructor that initializes invoices variable
    //
    //  Parameters:   N/A
    //
    //  Returns:      N/A
    //
    //**************************************************************
    public ProcessingInvoices()
    {
        invoices = new ArrayList<>();
    }

    private List<String> i = new ArrayList();


    //***************************************************************
    //
    //  Method:       loadInvoices
    //
    //  Description:  Takes name of file as argument, loads file,
    //                for each line of the file, splits line into
    //                String array, converts each String element
    //                into correct type to use to build new
    //                Invoice object. Invoice object added to
    //                ArrayList.
    //
    //  Parameters:   String
    //
    //  Returns:      N/A
    //
    //**************************************************************
    public void loadInvoices(String fileName)
    {

        try(Scanner reader = new Scanner(Paths.get(fileName)))
        {

            while(reader.hasNext())
            {

                String line = reader.nextLine();
                String[] tokens = line.split(",");

                int partNumber = Integer.parseInt(tokens[0]);
                String partDescription = tokens[1];
                int quantity = Integer.parseInt(tokens[2]);
                double pricePerItem = Double.parseDouble(tokens[3]);

                invoices.add(new Invoice(partNumber, partDescription,
                        quantity, pricePerItem));

            }



        }
        catch(IOException e)
        {
            System.err.printf("Error processing file. Please ensure that the name of the " +
                    "file you entered is correct.%n%n%s%n%n", e);
        }
        catch(NoSuchElementException e)
        {
            System.err.printf("File is in incorrect format. Please ensure all values are " +
                    "seperated by a comma and are listed in the correct order of:" +
                    "%nPart Number, Part Description, Quantity, and Price Per Item%n%n%s%n%n.", e);
        }
        catch(Exception e)
        {
            System.err.printf("An error has occurred.%n%n%s%n%n", e);
        }


    } // end loadInvoices

    //***************************************************************
    //
    //  Method:       displayQueries
    //
    //  Description:  Performs various queries on invoices.
    //
    //  Parameters:   N/A
    //
    //  Returns:      N/A
    //
    //**************************************************************
    public void displayQueries()
    {
        try
        {
            // Query part A header
            System.out.printf("%nInvoices sorted by part description:%n%n");
           // Query part A stream
            invoices.stream()
                    .sorted(Comparator.comparing(Invoice::getPartDescription))
                    .forEach(System.out::println);


            // Query part B header
            System.out.printf("%n%nInvoices sorted by price per item:%n%n");
            // Query part B stream
            invoices.stream()
                    .sorted(Comparator.comparing(Invoice::getPrice))
                    .forEach(System.out::println);

            // Query part C header
            System.out.printf("%n%nPart quantities and part descriptions sorted by quantity amounts:%n%n");
            // Query part C stream
            invoices.stream()
                    .sorted(Comparator.comparing(Invoice::getQuantity))
                    .forEach(
                            invoice -> {
                                System.out.printf("Quantity: %-4d  Description: %s%n", invoice.getQuantity(),
                                        invoice.getPartDescription());
                            }
                    );

            // Used to sort invoices by their total value in query part D
            Function<Invoice, Double> invoiceTotal =
                    invoice -> (invoice.getPrice() * invoice.getQuantity());

            // Query part D header
            System.out.printf("%n%nInvoice total and part description sorted by total value:%n%n");
            // Query part D stream
            invoices.stream()
                    .sorted(Comparator.comparing(invoiceTotal))
                    .forEach(
                            invoice -> {
                                System.out.printf("Invoice Total: $%-8.2f  Description: %s%n",
                                        invoice.getQuantity() * invoice.getPrice(),
                                        invoice.getPartDescription());
                            }
                    );


            // Used to filter invoices that total between $200 to $500 in query part E
            Predicate<Invoice> betweenTwoAndFive =
                    invoice ->
                            (invoice.getQuantity() * invoice.getPrice() >= 200.00 &&
                                invoice.getQuantity() * invoice.getPrice() <= 500.00);

            // Query part E header
            System.out.printf("%n%nInvoice total and part description of invoices totaling between%n" +
                    "two hundred to five hundred dollars and sorted by total value:%n%n");
            // Query part E stream
            invoices.stream()
                    .filter(betweenTwoAndFive)
                    .sorted(Comparator.comparing(invoiceTotal))
                    .forEach(
                            invoice -> {
                                System.out.printf("Invoice Total: $%-8.2f  Description: %s%n",
                                        invoice.getQuantity() * invoice.getPrice(),
                                        invoice.getPartDescription());
                            }
                    );


            // Used to filter out invoices that do not contain keyword "Saw" in query part F
            Predicate<Invoice> containsSaw =
                    invoice -> (invoice.getPartDescription().contains("Saw"));
            // Query part F header
            System.out.printf("%n%nInvoices that contain the word \"Saw\" in their " +
                    "part description:%n%n");
            // Query part F stream
            invoices.stream()
                    .filter(containsSaw)
                    .forEach(System.out::println);



        }
        catch(Exception e)
        {
            System.err.printf("An error has occurred.%n%n%s%n%n", e);
        }

        System.out.println();

    } // end displayQueries



} // end ProcessingInvoices;
