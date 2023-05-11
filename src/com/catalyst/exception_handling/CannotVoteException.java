package com.catalyst.exception_handling;

//we can create custom exceptions by creating a class as child of java.lang.Exception
public class CannotVoteException extends Exception{
    CannotVoteException(String str)
    {
        super(str);
    }
}
