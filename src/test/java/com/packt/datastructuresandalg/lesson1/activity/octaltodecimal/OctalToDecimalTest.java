package com.packt.datastructuresandalg.lesson1.activity.octaltodecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OctalToDecimalTest {

  @Test
  void testZeroOctal() {
    OctalToDecimal octalToDecimal = new OctalToDecimal();
    assertEquals(0, octalToDecimal.convertToDecimal("0"));
  }

  @Test
  void testOneOctal() {
    OctalToDecimal octalToDecimal = new OctalToDecimal();
    assertEquals(1, octalToDecimal.convertToDecimal("1"));
  }

  @Test
  void testFiveOctal() {
    OctalToDecimal octalToDecimal = new OctalToDecimal();
    assertEquals(5, octalToDecimal.convertToDecimal("5"));
  }

  @Test
  void test17Octal() {
    OctalToDecimal octalToDecimal = new OctalToDecimal();
    assertEquals(15, octalToDecimal.convertToDecimal("17"));
  }

  @Test
  void test72625Octal() {
    OctalToDecimal octalToDecimal = new OctalToDecimal();
    assertEquals(30101, octalToDecimal.convertToDecimal("72625"));
  }

  @Test
  void test55142Octal() {
    OctalToDecimal octalToDecimal = new OctalToDecimal();
    assertEquals(octalToDecimal.convertToDecimal("55142"), 23138);
  }
}
