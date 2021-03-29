package ru.inxt.easyjava.exeption;

public class BadRecuestExeption  extends RuntimeException{

    public BadRecuestExeption(String message) {
        super("Super exception " + message);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
