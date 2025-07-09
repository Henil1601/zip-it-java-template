package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testZipWithIntegers() {
        List<Integer> list1 = List.of(1, 3, 5);
        List<Integer> list2 = List.of(2, 4, 6, 8);
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6, 8);
        assertEquals(expected, App.zip(list1, list2));
    }

    @Test
    void testZipWithStrings() {
        List<String> list1 = List.of("A", "B");
        List<String> list2 = List.of("X", "Y", "Z");
        List<String> expected = List.of("A", "X", "B", "Y", "Z");
        assertEquals(expected, App.zip(list1, list2));
    }

    @Test
    void testZipEmptyList() {
        List<String> list1 = List.of();
        List<String> list2 = List.of("One", "Two");
        List<String> expected = List.of("One", "Two");
        assertEquals(expected, App.zip(list1, list2));
    }
}
