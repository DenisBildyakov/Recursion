import java.util.ArrayList;
import java.util.List;

public class Recursion_5_1 {
    // 5. печать только чётных значений из списка
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        printEven(list);
    }

    public static void printEven(List<Integer> list) {
        printEven_recursion(list, list.size());
    }

    public static void printEven_recursion(List<Integer> list, int listSize) {
        if (listSize <= 0) return;
        Integer i = list.get(--listSize);
        if (i % 2 == 0) System.out.println(i);
        printEven_recursion(list, listSize);
    }
}
