import java.util.ArrayList;
import java.util.List;

public class Recursion_5_3 {
    // 5. печать только чётных значений из списка
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        printEven(list);
    }

    public static void printEven(List<Integer> list) {
        if (list.isEmpty()) return;
        Integer i = list.removeLast();
        if (i % 2 == 0) System.out.println(i);
        printEven(list);
    }
}
