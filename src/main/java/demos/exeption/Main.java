package demos.exeption;

public class Main {
    public static void main(String[] args) {

        try {
            MathOperator.Divivsion(9, 2);
            System.out.println("Succeed");
        }catch (DividedByZeroException ex) {
            System.out.println("Catch de l'excepton");
            System.out.println(ex.getMessage());
        }catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Finito");
    }
}
