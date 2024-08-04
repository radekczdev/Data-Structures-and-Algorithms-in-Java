package com.packt.datastructuresandalg.lesson6.activity.weightedundirected;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class AdjacencyMatrixWeightedUndirectedTest {

    @Test
    public void test1() {
        AdjacencyMatrixWeightedUndirected g = new AdjacencyMatrixWeightedUndirected(5);
        g.addEdge(0, 1, 10);
        g.addEdge(0, 4, 5);
        g.addEdge(1, 2, 3);
        g.addEdge(2, 3, 1);
        g.addEdge(4, 3, 2);

        Assertions.assertEquals(5, g.edgeWeight(4, 0));
        Assertions.assertEquals(5, g.edgeWeight(0, 4));
        Assertions.assertEquals(10, g.edgeWeight(0, 1));
        Assertions.assertEquals(10, g.edgeWeight(1, 0));
        Assertions.assertEquals(2, g.edgeWeight(3, 4));
        Assertions.assertEquals(0, g.edgeWeight(1, 3));
    }
}
