//*************************************************************
//
//  Developer:     Austin Riggs
//
//  Program #:     Five
//
//  File Name:     Program5.java
//
//  Course:        ITSE 2317 Java Programming (Intermediate)
//
//  Due Date:      7/15/23
//
//  Instructor:    Prof. Fred Kumi
//
//  Chapter:       17
//
//  Description:   Program5 used to demonstrate ProcessingInvoices
//                 object.
//
//******************************************************************

public class Program5
{

    public static void main (String[] args)
    {
        // ProcessingInvoices object initialized
        ProcessingInvoices invoiceList = new ProcessingInvoices();
        // Loads file to create invoices
        invoiceList.loadInvoices("Invoice-Data.txt");
        // Displays queries
        invoiceList.displayQueries();


    }

}
