package ua.edu.chmnu.fks.oop.lab_6.Exceptions;

public class SalaryException extends Exception{
    public SalaryExceptionn() {
    }

    public SalaryExceptionn(String message) {
        super(message);
    }

    public SalaryExceptionn(String message, Throwable cause) {
        super(message, cause);
    }

    public SalaryExceptionn(Throwable cause) {
        super(cause);
    }

    public SalaryExceptionn(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
