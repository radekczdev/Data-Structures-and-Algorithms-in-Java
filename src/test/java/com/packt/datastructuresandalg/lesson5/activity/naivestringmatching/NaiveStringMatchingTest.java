package com.packt.datastructuresandalg.lesson5.activity.naivestringmatching;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;

public class NaiveStringMatchingTest {

    NaiveStringMatching nsm = new NaiveStringMatching();

    @Test
    public void test1() {
        Assertions.assertEquals(Arrays.asList(0), nsm.match("abc", "abc"));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(new ArrayList<>(), nsm.match("abd", "abc"));
    }

    @Test
    public void test3() {
        Assertions.assertEquals(new ArrayList<>(), nsm.match("abcde", "abc"));
    }

    @Test
    public void test4() {
        Assertions.assertEquals(Arrays.asList(2), nsm.match("aab", "acaabc"));
    }

    @Test
    public void test5() {
        Assertions.assertEquals(Arrays.asList(2, 6), nsm.match("aab", "acaabcaab"));
    }
}
