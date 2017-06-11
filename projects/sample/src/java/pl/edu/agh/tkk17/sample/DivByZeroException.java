package pl.edu.agh.tkk17.sample;


public class DivByZeroException extends OutputableException {
    public DivByZeroException(String message){
        super(message);
    }
}