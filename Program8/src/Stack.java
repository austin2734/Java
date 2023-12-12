///********************************************************************
//
//  Developer:     Textbook Authors
//
//  Program #:     Eight
//
//  File Name:     Stack.java
//
//  Course:        ITSE 2317 Intermediate Java Programming
//
//  Due Date:           
//
//  Instructor:    Fred Kumi 
//
//  Chapter:       21
//
//  Description:   Stack uses a composed List object.
//
//********************************************************************

import java.util.NoSuchElementException;

public class Stack<T>
{
    private final List<T> stackList;

    // no-argument constructor
    public Stack()
    {
        stackList = new List<>("stack");
    }

    // add object to stack
    public void push(T object)
    {
        stackList.insertAtFront(object);
    }

    // remove object from stack
    public T pop() throws NoSuchElementException
    {
        return stackList.removeFromFront();
    }

    // determine if stack is empty
    public boolean isEmpty()
    {
        return stackList.isEmpty();
    }

    // output stack contents
    public void print()
    {
        stackList.print();
    }

    public T peak()
    {
        T temp = stackList.removeFromFront();
        stackList.insertAtFront(temp);

        return temp;
    }
}