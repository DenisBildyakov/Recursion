public class Recursion_2 {
    // 2. вычисление суммы цифр числа;
    public static void main(String[] args) {
        System.out.println(sumOfNumbers(123));          // 6
        System.out.println(sumOfNumbers(1234));         // 10
        System.out.println(sumOfNumbers(12345));        // 15
        System.out.println(sumOfNumbers(123456));       // 21
        System.out.println(sumOfNumbers(1234567));      // 28
        System.out.println(sumOfNumbers(12345678));     // 36
        System.out.println(sumOfNumbers(123456789));    // 45
    }

    public static int sumOfNumbers(int number) {
        if (number % 10 == 0) return number;
        return number % 10 + sumOfNumbers(number / 10);
    }
}