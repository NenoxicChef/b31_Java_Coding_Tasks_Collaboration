package week10;

import java.util.ArrayList;

public class SortArrayListDescending_FM {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);


        sortArrayList(numbers);


        System.out.println("Sorted ArrayList: " + numbers);
    }

    public static void sortArrayList(ArrayList<Integer> arr) {
        int n = arr.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr.get(j) < arr.get(j + 1)) {

                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }
}

/*
ArrayList - sorting in descending order
Write a method that can sort the ArrayList in descending order without
using the sort method.
 */
