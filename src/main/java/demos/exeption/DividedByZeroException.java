package demos.exeption;

public class DividedByZeroException extends RuntimeException{

    public DividedByZeroException(){
        super("Divided by zero");
    }

    public DividedByZeroException(String message){
        super(message);
    }
}
