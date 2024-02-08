package week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removeAhmed_BM {

    public static List<String> removeAhmed(List<String> names) {
        names.removeAll(Arrays.asList("Ahmed"));
        return names;
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Sam", "Jane"));

        System.out.println(removeAhmed(names));

    }

}
