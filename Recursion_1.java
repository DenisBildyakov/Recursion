public class Recursion_1 {
    // 1. возведение числа N в степень M;
    public static void main(String[] args) {
        System.out.println(exponentiation(2, 2));
        System.out.println(exponentiation(2, 3));
        System.out.println(exponentiation(2, 4));

        System.out.println(exponentiation(3, 2));
        System.out.println(exponentiation(3, 3));
        System.out.println(exponentiation(3, 4));

        System.out.println(exponentiation(4, 2));
        System.out.println(exponentiation(4, 3));
        System.out.println(exponentiation(4, 4));
    }

    public static int exponentiation(int number, int exponent) {
        if (exponent == 1) return number;
        return number * exponentiation(number, exponent - 1);
    }
}