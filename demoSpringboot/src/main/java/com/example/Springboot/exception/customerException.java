package com.example.Springboot.exception;

public class customerException extends Exception {
private static final long serialversionID = 1L;
String errorMsg;

public customerException(String errorMsg)
{
super();
this.errorMsg=errorMsg;
}

}
