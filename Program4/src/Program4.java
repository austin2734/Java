//*************************************************************
//
//  Developer:     Instructor
//
//  Program #:     Four
//
//  File Name:     Program4.java
//
//  Course:        ITSE 2317 Java Programming (Intermediate)
//
//  Due Date:      6/29/2022
//
//  Instructor:    Prof. Fred Kumi
//
//  Chapter:       15
//
//  Description: Program4 used to create and test WorldSeriesMap
//               Object.
//
//******************************************************************
public class Program4
{
    public static void main(String[] args)
    {
        WorldSeriesMap myMap = new WorldSeriesMap();
        myMap.loadFile("Program4.txt");
        myMap.searchMap();

    } // end main

} // end Program4
