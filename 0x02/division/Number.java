public class Number {
    public static void todivide(int a, int b) {
        int res = 0;
        try {
            res = a / b;
        } catch (Exception e) {
            System.out.println("It is not possible to divide by zero.");
        } finally {
            System.out.printf("%d / %d = %d", a, b, res);
        }
    }
}