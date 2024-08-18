package com.packt.datastructuresandalg.lesson2.activity.postfix;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvalPostfixTest {
    private EvalPostfix evalPostfix = new EvalPostfix();

    @Test
    void testEvalSimpleAddition() {
        assertEquals(3.0, evalPostfix.evaluate("1 2 +"));
    }

    @Test
    void testEvalTwoDigitsNumberAddition() {
        assertEquals(13.0, evalPostfix.evaluate("11 2 +"));
    }

    @Test
    void testEvalMultipleOperands() {
        assertEquals(7.0, evalPostfix.evaluate("1 2 3 * +"));
    }

    @Test
    void testEvalPlusPrecedence() {
        assertEquals(9.0, evalPostfix.evaluate("1 2 + 3 *"));
    }

    @Test
    void testEvalDiv() {
        assertEquals(11.0, evalPostfix.evaluate("5 4 2 / 3 * +"));
    }

    @Test
    void testEdgeCaseNumber() {
        assertEquals(9.0, evalPostfix.evaluate("9"));
    }
}
