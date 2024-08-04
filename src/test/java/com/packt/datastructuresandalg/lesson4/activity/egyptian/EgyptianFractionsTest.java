package com.packt.datastructuresandalg.lesson4.activity.egyptian;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EgyptianFractionsTest {

    EgyptianFractions fractions = new EgyptianFractions();

    @Test
    void test1() {
        assertEquals(Arrays.asList(2L, 6L), fractions.build(2L, 3L));
    }

    @Test
    void test2() {
        assertEquals(Arrays.asList(3L, 11L, 231L), fractions.build(6L, 14L));
    }

    @Test
    void test3() {
        assertEquals(Arrays.asList(2L, 3L, 12L, 156L), fractions.build(12L, 13L));
    }

    @Test
    void test4() {
        assertEquals(Arrays.asList(2L, 4L), fractions.build(3L, 4L));
    }

    @Test
    void test5() {
        assertEquals(Arrays.asList(2L, 3L, 42L), fractions.build(6L, 7L));
    }

    @Test
    void test6() {
        assertEquals(Arrays.asList(2L, 8L), fractions.build(5L, 8L));
    }

    @Test
    void test7() {
        assertEquals(Arrays.asList(13L, 197L, 1280500L), fractions.build(123L, 1500L));
    }

    @Test
    void test8() {
        assertEquals(Arrays.asList(2L, 4L, 14L, 2939L, 14955066L, 654986696590548L), fractions.build(6123L, 7451L));
    }
}
