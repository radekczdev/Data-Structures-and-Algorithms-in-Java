package com.packt.datastructuresandalg.lesson7.activity.sieve;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class SieveOfEratosthenesTest {

    SieveOfEratosthenes sieve = new SieveOfEratosthenes(1000000);

    @Test
    public void test0() {
        Assertions.assertFalse(sieve.isPrime(0));
    }

    @Test
    public void test1() {
        Assertions.assertFalse(sieve.isPrime(1));
    }

    @Test
    public void test2() {
        Assertions.assertTrue(sieve.isPrime(2));
    }

    @Test
    public void test289049() {
        Assertions.assertTrue(sieve.isPrime(289049));
    }

    @Test
    public void test690997() {
        Assertions.assertTrue(sieve.isPrime(690997));
    }

    @Test
    public void test690998() {
        Assertions.assertFalse(sieve.isPrime(690998));
    }

    @Test
    public void test999983() {
        Assertions.assertTrue(sieve.isPrime(999983));
    }

    @Test
    public void test999999() {
        Assertions.assertFalse(sieve.isPrime(999999));
    }
}
