import java.util.ArrayList;
import java.util.List;

public class Recursion_6 {
    // 6. печать элементов списка с чётными индексами
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        printEvenIndexes(list);
    }

    public static void printEvenIndexes(List<Integer> list) {
        printEvenIndexes_recursion(list, 0);
    }

    public static void printEvenIndexes_recursion(List<Integer> list, int index) {
        if (index >= list.size()) return;
        System.out.println(list.get(index));
        printEvenIndexes_recursion(list, index + 2);
    }
}