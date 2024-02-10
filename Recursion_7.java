import java.util.List;

public class Recursion_7 {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10); // 10, 9
        List<Integer> list2 = List.of(2, 2); // 2, 2
        List<Integer> list3 = List.of(2, 2, 3); // 3, 2
        List<Integer> list4 = List.of(2, 2, 3, 3); // 3, 3
        List<Integer> list5 = List.of(5, 2, 3, 4, 5); // 5, 5
        List<Integer> list6 = List.of(0, 1, 10, 9, 6, 0); // 10, 9
        System.out.println(findSecondBiggest(list1, list1.size(), 0, 0));
        System.out.println(findSecondBiggest(list2, list2.size(), 0, 0));
        System.out.println(findSecondBiggest(list3, list3.size(), 0, 0));
        System.out.println(findSecondBiggest(list4, list4.size(), 0, 0));
        System.out.println(findSecondBiggest(list5, list5.size(), 0, 0));
        System.out.println(findSecondBiggest(list6, list6.size(), 0, 0));
    }

    public static int findSecondBiggest(List<Integer> list, int listSize, int biggest, int secondBiggest) {
        int index = listSize - 1;
        if (index < 0) return secondBiggest;
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
        return findSecondBiggest(list, --listSize, tmpBiggest, tmpSecondBiggest);
    }
}