package chapter27;

public class ExceptionTest5 {
    public static void main(String[] args) {
        try {
            String arg = args[0];
            String arg1 = args[1];
            double v = Double.parseDouble(arg);
            double v1 = Double.parseDouble(arg1);
            divide(v, v1);
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException | BelowZeroException e) {
            e.printStackTrace();
        }
    }

    public static double divide(double a, double b) {
        if (a < 0 || b < 0) {
            throw new BelowZeroException("除数或被除数不能小于零");
        }
        return a / b;
    }
}
