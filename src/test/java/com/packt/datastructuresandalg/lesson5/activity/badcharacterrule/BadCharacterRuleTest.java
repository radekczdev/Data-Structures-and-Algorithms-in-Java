package com.packt.datastructuresandalg.lesson5.activity.badcharacterrule;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;

public class BadCharacterRuleTest {

    BadCharacterRule bcr = new BadCharacterRule();

    @Test
    public void test1() {
        Assertions.assertEquals(Arrays.asList(0), bcr.match("abc", "abc"));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(new ArrayList<>(), bcr.match("abd", "abc"));
    }

    @Test
    public void test3() {
        Assertions.assertEquals(new ArrayList<>(), bcr.match("abcde", "abc"));
    }

    @Test
    public void test4() {
        Assertions.assertEquals(Arrays.asList(2), bcr.match("aab", "acaabc"));
    }

    @Test
    public void test5() {
        Assertions.assertEquals(Arrays.asList(2, 6), bcr.match("aab", "acaabcaab"));
    }

    @Test
    public void test6() {
        Assertions.assertEquals(Arrays.asList(23), bcr.match("rabrabracad", "abacadabrabracabracadabrabrabracad"));
    }
}
