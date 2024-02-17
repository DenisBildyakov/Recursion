import java.util.List;

public class Recursion_7 {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10); // 10, 9
        List<Integer> list2 = List.of(2, 2); // 2, 2
        List<Integer> list3 = List.of(2, 2, 3); // 3, 2
        List<Integer> list4 = List.of(2, 2, 3, 3); // 3, 3
        List<Integer> list5 = List.of(5, 2, 3, 4, 5); // 5, 5
        List<Integer> list6 = List.of(0, 1, 10, 9, 6, 0); // 10, 9
        List<Integer> list7 = List.of(-5, -2, -3, -4, -5); // -2, -3
        List<Integer> list8 = List.of(0, -1, -10, -9, -6); // 0, -1
        List<Integer> list9 = List.of(0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10); // 0, -1
        List<Integer> list10 = List.of(-2, -2); // -2, -2
        List<Integer> list11 = List.of(-2, 2, -3); // 2, -2
        List<Integer> list12 = List.of(-2, 2, -3, 3); // 3, 2
        List<Integer> list13 = List.of(8, 9, 5, 4, 8, 2, 4, 6, 3, 5, 1, 2, 5, 7, 1, 8, 7); // 9, 8
        System.out.println(findSecondBiggest(list1));
        System.out.println(findSecondBiggest(list2));
        System.out.println(findSecondBiggest(list3));
        System.out.println(findSecondBiggest(list4));
        System.out.println(findSecondBiggest(list5));
        System.out.println(findSecondBiggest(list6));
        System.out.println(findSecondBiggest(list7));
        System.out.println(findSecondBiggest(list8));
        System.out.println(findSecondBiggest(list9));
        System.out.println(findSecondBiggest(list10));
        System.out.println(findSecondBiggest(list11));
        System.out.println(findSecondBiggest(list12));
        System.out.println(findSecondBiggest(list13));
    }

    public static int findSecondBiggest(List<Integer> list) {
        return findSecondBiggest_recursion(list, 1, list.get(0), list.get(1));
    }

    public static int findSecondBiggest_recursion(List<Integer> list, int listSize, int biggest, int secondBiggest) {
        int index = listSize;
        if (index >= list.size()) return secondBiggest;
        int tmpBiggest = biggest;
        int tmpSecondBiggest = secondBiggest;
        Integer i = list.get(index);
        if (i >= biggest) {
            tmpSecondBiggest = biggest;
            tmpBiggest = i;
        }
        if (i < biggest && i > secondBiggest) {
            tmpSecondBiggest = i;
        }
        return findSecondBiggest_recursion(list, ++index, tmpBiggest, tmpSecondBiggest);
    }
}