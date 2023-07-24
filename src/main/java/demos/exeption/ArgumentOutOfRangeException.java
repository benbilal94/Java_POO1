package demos.exeption;

public class ArgumentOutOfRangeException extends Exception {

    public ArgumentOutOfRangeException() {
        super("Argument out of range.");
    }

    public ArgumentOutOfRangeException(String message) {
        super(message);
    }

}
