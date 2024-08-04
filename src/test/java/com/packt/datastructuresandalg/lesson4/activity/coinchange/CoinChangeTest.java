package com.packt.datastructuresandalg.lesson4.activity.coinchange;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CoinChangeTest {
    CoinChange change = new CoinChange();

    @Test
    void test1() {
        int[] coins = {1, 2, 3};
        assertTrue(change.ways(4, coins) == 4);
    }

    @Test
    void test2() {
        int[] coins = {2, 3, 5, 6};
        assertTrue(change.ways(10, coins) == 5);
    }

    @Test
    void test3() {
        int[] coins = {1, 5, 10, 25};
        assertTrue(change.ways(63, coins) == 73);
    }
}
