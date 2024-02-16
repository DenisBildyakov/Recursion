public class Recursion_4 {
    // 4. проверка, является ли строка палиндромом;
    public static void main(String[] args) {
        // true
        String str1 = "белхлеб";
        String str2 = "туткактут";
        String str3 = "искатьтакси";
        String str4 = "алесусела";
        String str5 = "дивенмневид";
        String str6 = "акилеввелика";
        String str7 = "котутащатуток";
        String str8 = "afa";
        String str9 = "F";
        String str10 = "";

        // false
        String str11 = "праздник к нам приходит";
        String str12 = "во тьме ночной";
        String str13 = "я за хлебом";

        // true
        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
        System.out.println(isPalindrome(str3));
        System.out.println(isPalindrome(str4));
        System.out.println(isPalindrome(str5));
        System.out.println(isPalindrome(str6));
        System.out.println(isPalindrome(str7));
        System.out.println(isPalindrome(str8));
        System.out.println(isPalindrome(str9));
        System.out.println(isPalindrome(str10));

        // false
        System.out.println(isPalindrome(str11));
        System.out.println(isPalindrome(str12));
        System.out.println(isPalindrome(str13));

    }

    public static boolean isPalindrome(String str) {
        return isPalindrome_recursive(str, 0);
    }

    public static boolean isPalindrome_recursive(String str, int shift) {
        if (shift >= str.length() / 2) return true;
        int strBegg = shift;
        int strEnd = str.length() - 1 - shift;
        if (str.charAt(strBegg) != str.charAt(strEnd)) return false;
        return isPalindrome_recursive(str, ++shift);
    }
}