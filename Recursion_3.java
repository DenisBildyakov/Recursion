import java.util.LinkedList;
import java.util.List;

public class Recursion_3 {
    // 3. расчёт длины списка, для которого разрешена только операция удаления первого элемента pop(0) (и получение длины конечно);
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(listSizeCalc(linkedList));
    }

    public static int listSizeCalc(List<?> list) {
        if (list.size() == 0) return 0;
        list.removeFirst();
        return 1 + listSizeCalc(list);
    }
}