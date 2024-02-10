import java.util.List;

public class Recursion_6 {
    // 6. печать элементов списка с чётными индексами
    public static void main(String[] args) {
        List<Integer> list = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        printEvenIndexes(list, list.size());
    }

    public static void printEvenIndexes(List<Integer> list, int listSize) {
        if (listSize <= 0) return;
        if (--listSize % 2 == 0) System.out.println(list.get(listSize));
        printEvenIndexes(list, listSize);
    }
}