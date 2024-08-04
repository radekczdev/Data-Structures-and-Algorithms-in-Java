package com.packt.datastructuresandalg.lesson6.activity.floydwarshall;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

public class FloydWarshallTest {

    @Test
    public void test() {
        FloydWarshall f = new FloydWarshall(5);
        f.addEdge(0, 1, 10);
        f.addEdge(0, 3, 5);
        f.addEdge(1, 3, 2);
        f.addEdge(1, 2, 1);
        f.addEdge(2, 4, 4);
        f.addEdge(3, 1, 3);
        f.addEdge(3, 2, 9);
        f.addEdge(3, 4, 2);
        f.addEdge(4, 2, 6);
        f.run();

        Assertions.assertEquals(Arrays.asList(0), f.path(0, 0));
        Assertions.assertEquals(Arrays.asList(0, 3, 1), f.path(0, 1));
        Assertions.assertEquals(Arrays.asList(0, 3, 1, 2), f.path(0, 2));
        Assertions.assertEquals(Arrays.asList(0, 3), f.path(0, 3));
        Assertions.assertEquals(Arrays.asList(0, 3, 4), f.path(0, 4));
        Assertions.assertEquals(Arrays.asList(1, 3, 4), f.path(1, 4));
    }
}
