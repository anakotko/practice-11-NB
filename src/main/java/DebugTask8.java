public class DebugTask8 {
    public static void main(String[] args) {
        // есть 2 варианта
        // 1 вариант: округлить числа:
        double a = 0.1 * 3;
        double b = 0.3;
        a = Math.round(a * 1000.0) / 1000.0;
        b = Math.round(b * 1000.0) / 1000.0;

        // 2 вариант: сравнить с допустимой погрешностью:
        /*
        double epsilon = 0.000001;
        if (Math.abs(a - b) < epsilon) {
        System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
         */

        if (a == b) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
