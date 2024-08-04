package com.packt.datastructuresandalg.lesson1.activity.octaltodecimal;

public class OctalToDecimal {

  public int convertToDecimal(String octal) {
    int length = octal.length();
    int power = 1;
    int result = 0;
    for (int i = 1; i <= length; i++) {
      final var currentValue = Character.getNumericValue(octal.charAt(length - i)) * power;
      result = result + currentValue;
      power *= 8;
    }
    return result;
  }
}
