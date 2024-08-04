package com.packt.datastructuresandalg.lesson5.activity.boyermoore;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;

public class BoyerMooreTest {

    BoyerMoore bm = new BoyerMoore();

    @Test
    public void test1() {
        Assertions.assertEquals(Arrays.asList(0), bm.match("abc", "abc"));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(new ArrayList<>(), bm.match("abd", "abc"));
    }

    @Test
    public void test3() {
        Assertions.assertEquals(new ArrayList<>(), bm.match("abcde", "abc"));
    }

    @Test
    public void test4() {
        Assertions.assertEquals(Arrays.asList(2), bm.match("aab", "acaabc"));
    }

    @Test
    public void test5() {
        Assertions.assertEquals(Arrays.asList(2, 6), bm.match("aab", "acaabcaab"));
    }

    @Test
    public void test6() {
        Assertions.assertEquals(Arrays.asList(23), bm.match("rabrabracad", "abacadabrabracabracadabrabrabracad"));
    }

}
