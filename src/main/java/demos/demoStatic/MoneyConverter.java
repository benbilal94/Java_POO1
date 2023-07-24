package demos.demoStatic;

public class MoneyConverter {


    public static class Converter {

        public static double dollarToEuro(double amount) {
            return amount * 0.9020;
        }

        public static double euroToDollar(double amount) {
            return amount * 1.1087;
        }
    }

}
