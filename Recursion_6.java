import java.util.ArrayList;
import java.util.List;

public class Recursion_6 {
    // 6. печать элементов списка с чётными индексами
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        printEvenIndexes(list);
    }

    public static void printEvenIndexes(List<Integer> list) {
        int indexOfLast = list.indexOf(list.getLast());
        list.addLast(indexOfLast);
        printEvenIndexes_recursion(list);
    }

    public static void printEvenIndexes_recursion(List<Integer> list) {
        Integer index = list.removeLast();
        if (index < 0) return;
        if (index % 2 == 0) System.out.println(list.get(index));
        list.addLast(--index);
        printEvenIndexes_recursion(list);
    }
}