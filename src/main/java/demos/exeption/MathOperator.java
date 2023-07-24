package demos.exeption;

public class MathOperator {

    public static int Divivsion(int a, int b) throws DividedByZeroException {
        if (b == 0) {
            throw new DividedByZeroException("Autre chose"); // pas de params
        }
        if (a % 2 != 0) {
            throw new ArithmeticException("Je divise pas les nobre impairs");
        }
        return a / b;
    }
}
