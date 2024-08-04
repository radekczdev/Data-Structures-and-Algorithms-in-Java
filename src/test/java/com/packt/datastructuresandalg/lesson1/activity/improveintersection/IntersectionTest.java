package com.packt.datastructuresandalg.lesson1.activity.improveintersection;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class IntersectionTest {
    Intersection interstection = new Intersection();

    @Test
    void testInterstection() {
        int[] numbers1 = new int[]{66, 24, 75, 22, 12, 87};
        int[] numbers2 = new int[]{32, 41, 98, 66, 39, 24};

        List<Integer> result = interstection.intersectionFast(numbers1, numbers2);

        List<Integer> expected = Arrays.asList(66, 24);

        assertEquals(new HashSet<>(expected), new HashSet<>(result));
    }

    @Test
    void testFullInterstection() {
        int[] numbers1 = new int[]{66, 24, 75, 22, 12, 87};
        int[] numbers2 = new int[]{66, 24, 75, 22, 12, 87};

        List<Integer> result = interstection.intersectionFast(numbers1, numbers2);

        List<Integer> expected = Arrays.asList(66, 24, 75, 22, 12, 87);

        assertEquals(new HashSet<>(expected), new HashSet<>(result));
    }

    @Test
    void testEqualInterstection() {
        int[] numbers1 = new int[]{2, 2, 2, 2};
        int[] numbers2 = new int[]{2, 2, 2, 2};

        List<Integer> result = interstection.intersectionFast(numbers1, numbers2);

        List<Integer> expected = Arrays.asList(2, 2, 2, 2);

        assertEquals(expected, result);
    }

    @Test
    void testEmptyInterstection() {
        int[] numbers1 = new int[]{2, 4, 1, 3, 5};
        int[] numbers2 = new int[]{7, 6, 9, 0, 8};

        List<Integer> result = interstection.intersectionFast(numbers1, numbers2);

        List<Integer> expected = Arrays.asList();

        assertEquals(expected, result);
    }
}
