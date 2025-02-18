package cz.muni.fi.pa165;

public class ReverseString {
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }
}
