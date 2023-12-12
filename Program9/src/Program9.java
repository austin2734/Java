
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.security.SecureRandom;
import java.time.Duration;
import java.time.Instant;
import java.text.NumberFormat;

//********************************************************************
//
//  Developer:     Textbook Authors / Austin Riggs
//
//  Program #:     nine
//
//  File Name:     Program9.java
//
//  Course:        ITSE 2317 Intermediate Java Programming
//
//  Due Date:      7/29/23
//
//  Instructor:    Fred Kumi
//
//  Chapter:       23
//
//  Description:   Modified version of SharedArrayTest. Used to compare
//                 run times of creating and loading two arrays,
//                 one using multiple threads and the other
//                 using a single thread.
//
//
//********************************************************************

public class Program9
{
    public static void main(String[] arg)
    {
        // size of array
        final int arraySize = 15000000;
        // number of indices handled per ArrayWriter
        final int indicesPerWriter = arraySize / 4;

        // Used to hold String returned from compareTimes
        String percentage;

        // construct the shared object
        SimpleArray sharedSimpleArray = new SimpleArray(arraySize);

        // all variables used to record and calculate run times of each process
        Instant singleThreadStart;
        Instant singleThreadEnd;
        Instant multiThreadEnd;
        Instant multiThreadStart;
        long multiThreadDuration;
        long singleThreadDuration;



        // create four tasks to write to the shared SimpleArray
        ArrayWriter writer1 = new ArrayWriter(indicesPerWriter, sharedSimpleArray);
        ArrayWriter writer2 = new ArrayWriter(indicesPerWriter, sharedSimpleArray);
        ArrayWriter writer3 = new ArrayWriter(indicesPerWriter, sharedSimpleArray);
        ArrayWriter writer4 = new ArrayWriter(indicesPerWriter, sharedSimpleArray);

        // start time recorded
        multiThreadStart = Instant.now();

        // execute the tasks with an ExecutorService
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(writer1);
        executorService.execute(writer2);
        executorService.execute(writer3);
        executorService.execute(writer4);

        // ensures threads are released when finished operations
        executorService.shutdown();

        try
        {
            // wait 1 minute for both writers to finish executing
            boolean tasksEnded =
                    executorService.awaitTermination(1, TimeUnit.MINUTES);
            // SimpleArray loaded correctly
            if (tasksEnded)
            {
                System.out.printf("SimpleArray loaded successfully.%n%n");
            }
            // process timed out
            else
            {
                System.out.println(
                        "Timed out while waiting for tasks to finish.");
            }
        }
        catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }

        // stop time recorded
        multiThreadEnd = Instant.now();

        // new Program9 object created, used test methods
        // singleThreadedArray and compareTimes
        Program9 methodTester = new Program9();

        // start time recorded
        singleThreadStart = Instant.now();

        // singleThreadedArray called with size of array to create
        // sum total of all values in array returned
        long singleTotal = methodTester.singleThreadedArray(arraySize);

        // stop time recorded
        singleThreadEnd = Instant.now();


        // total duration of multithreaded operation calculated
        multiThreadDuration = Duration.between(multiThreadStart,
                multiThreadEnd).toMillis();

        // total duration of single thread operation calculated
        singleThreadDuration = Duration.between(singleThreadStart,
                singleThreadEnd).toMillis();


        // displays single thread duration
        System.out.printf("Single Threaded Duration (milliseconds): %d%nSingle " +
                        "Threaded Array Sum: %d%n%n", singleThreadDuration, singleTotal);

        // displays multithreaded duration
        System.out.printf("Multithreaded Duration (milliseconds): %d%nMultithreaded " +
                "Array Sum: %d%n%n", multiThreadDuration, sharedSimpleArray.getTotal());


        // single thread was faster than multithreaded
        if ( singleThreadDuration < multiThreadDuration)
        {
            percentage = methodTester.compareTimes(multiThreadDuration,
                    singleThreadDuration);

            System.out.printf("The multithreaded operation took %s longer than " +
                            "the single threaded one.%n%n", percentage);
        }
        // multithreaded was faster than single thread
        else if (multiThreadDuration < singleThreadDuration)
        {
            percentage = methodTester.compareTimes(multiThreadDuration,
                    singleThreadDuration);

            System.out.printf("The single threaded operation took %s longer than " +
                            "the multithreaded one.%n%n", percentage);
        }
        // both operations took same amount of time
        else
        {
            System.out.printf("Both the multithreaded operation " +
                    "and single threaded operation took the same amount of time.%n%n");
        }

    } // end main

    //***************************************************************
    //
    //  Method:       singleThreadedArray
    //
    //  Description:  creates and loaded int array of given size
    //
    //  Parameters:   int
    //
    //  Returns:      long
    //
    //**************************************************************
    public long singleThreadedArray(int size)
    {
        SecureRandom generator = new SecureRandom();
        int[] simpleIntArray = new int[size];
        long sum = 0;
        int value;

        try
        {
            Thread.sleep(3000);

        }
        catch(InterruptedException e)
        {
            System.out.printf("Something broke.", e);
        }



        for (int i = 0; i < size; i++)
        {
            value = generator.nextInt(20) + 1;
            simpleIntArray[i] = value;
            sum += value;
        }

        return sum;

    } // end singleThreadedArray

    //***************************************************************
    //
    //  Method:       compareTimes
    //
    //  Description:  calculates percentage time difference between
    //                two given times.
    //
    //  Parameters:   long, long
    //
    //  Returns:      String
    //
    //**************************************************************
    public String compareTimes(long multiTime, long singleTime)
    {
        String percentage;

        // single threaded time was faster
        if (singleTime < multiTime) {
            percentage = NumberFormat.getPercentInstance().format(
                    (double) (multiTime - singleTime) / singleTime);
        }
        // multithreaded was faster
        else
        {
            percentage = NumberFormat.getPercentInstance().format(
                    (double) (singleTime - multiTime) / multiTime);
        }

        return percentage;

    } // end compareTimes

} // end class Program9

