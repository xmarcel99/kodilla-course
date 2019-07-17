package com.kodilla.patterns2.facade.api;

public class OrderProcessingException extends Exception {

    public static  String ERR_NOT_AUTHORISED = "User is not authorised";
    public static String ERR_PAYMENT_REJECTED = "Payment was rejected";
    public static String ERR_VERYFICATION_ERRPR = "Veryfication error";
    public static String ERR_SUBBMITING_ERROR = "Cannot submit order";

    public OrderProcessingException(String message) {
        super(message);
    }
}
