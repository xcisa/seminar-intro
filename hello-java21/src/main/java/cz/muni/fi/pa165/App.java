package cz.muni.fi.pa165;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        List<String> messages = new ArrayList<>();
        messages.add(ReverseString.reverse("Hello"));
        messages.add(ReverseString.reverse("World"));
        System.out.println(messages);
    }
}
