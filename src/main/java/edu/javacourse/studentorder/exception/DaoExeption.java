package edu.javacourse.studentorder.exception;

public class DaoExeption extends Exception {
    public DaoExeption() {
    }

    public DaoExeption(String message) {
        super(message);
    }

    public DaoExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public DaoExeption(Throwable cause) {
        super(cause);
    }
}
