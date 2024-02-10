public class Recursion_4 {
    // 4. проверка, является ли строка палиндромом;
    public static void main(String[] args) {
        // true
        String str1 = "бел хлеб";
        String str2 = "тут как тут";
        String str3 = "искать такси";
        String str4 = "а лес у села";
        String str5 = "дивен мне вид";
        String str6 = "аки лев велика";
        String str7 = "коту тащат уток";
        String str8 = "afa";
        String str9 = "F";
        String str10 = "";
        String str11 = "праздник к нам приходит";
        String str12 = "во тьме ночной";
        String str13 = "я за хлебом";

        System.out.println(isPalindrome(str1, 0, str1.length()));
        System.out.println(isPalindrome(str2, 0, str2.length()));
        System.out.println(isPalindrome(str3, 0, str3.length()));
        System.out.println(isPalindrome(str4, 0, str4.length()));
        System.out.println(isPalindrome(str5, 0, str5.length()));
        System.out.println(isPalindrome(str6, 0, str6.length()));
        System.out.println(isPalindrome(str7, 0, str7.length()));
        System.out.println(isPalindrome(str8, 0, str8.length()));
        System.out.println(isPalindrome(str9, 0, str9.length()));
        System.out.println(isPalindrome(str10, 0, str10.length()));
//
//        // false
        System.out.println(isPalindrome(str11, 0, str11.length()));
        System.out.println(isPalindrome(str12, 0, str12.length()));
        System.out.println(isPalindrome(str13, 0, str13.length()));

    }

    public static boolean isPalindrome(String str, int startPointer, int endPointer) {
        if (startPointer >= endPointer) return true;
        int strBegg = startPointer;
        int strEnd = endPointer - 1;
        if (str.charAt(strBegg) == ' ') {
            ++startPointer;
            ++strBegg;
        }
        if (str.charAt(strEnd) == ' ') {
            --endPointer;
            --strEnd;
        }
        if (str.charAt(strBegg) != str.charAt(strEnd)) return false;
        return isPalindrome(str, ++startPointer, --endPointer);
    }
}