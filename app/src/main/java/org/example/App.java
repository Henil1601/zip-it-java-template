package org.example;

import java.util.ArrayList;
import java.util.List;

public class App {

    // Generic zip method
    public static <T> List<T> zip(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>();
        int size1 = list1.size();
        int size2 = list2.size();
        int i = 0;

        // Add items alternating from both lists
        while (i < size1 && i < size2) {
            result.add(list1.get(i));
            result.add(list2.get(i));
            i++;
        }

        // Add remaining items from list1
        while (i < size1) {
            result.add(list1.get(i));
            i++;
        }

        // Add remaining items from list2
        while (i < size2) {
            result.add(list2.get(i));
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> nums1 = List.of(1, 3, 5, 7);
        List<Integer> nums2 = List.of(2, 4, 6, 8);
        List<Integer> mergedNumbers = zip(nums1, nums2);
        System.out.println(mergedNumbers); // [1, 2, 3, 4, 5, 6, 7, 8]

        List<String> colors1 = List.of("Red", "Green", "Blue");
        List<String> colors2 = List.of("White", "Black", "Orange", "Pink", "Fuschia");
        List<String> mergedWords = zip(colors1, colors2);
        System.out.println(mergedWords); // [Red, White, Green, Black, Blue, Orange, Pink, Fuschia]
    }
}
