package com.packt.datastructuresandalg.lesson2.activity.postfix;

import com.packt.datastructuresandalg.lesson2.stack.Stack;
import java.util.Optional;

public class EvalPostfix {
  public double evaluate(String postfix) {
    var numbers = new Stack<Double>();
    var values = postfix.split(" ");
    for (String token : values) {
      if (token.chars().allMatch(Character::isDigit)) {
        numbers.push(Double.valueOf(token));
      } else {
        performCalculation(numbers, token);
      }
    }
    return numbers.pop().orElseThrow();
  }

  private void performCalculation(Stack<Double> numbers, String operand) {
    Optional<Double> value =  switch (operand) {
      case "+" -> numbers.pop().flatMap(n2 -> numbers.pop().map(n1 -> n1 + n2));
      case "-" -> numbers.pop().flatMap(n2 -> numbers.pop().map(n1 -> n1 - n2));
      case "/" -> numbers.pop().flatMap(n2 -> numbers.pop().map(n1 -> n1 / n2));
      case "*" -> numbers.pop().flatMap(n2 -> numbers.pop().map(n1 -> n1 * n2));
      default -> throw new NumberFormatException();
    };
    value.ifPresent(numbers::push);
  }
}
