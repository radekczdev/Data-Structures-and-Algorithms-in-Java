package com.packt.datastructuresandalg.lesson6.activity.maze;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MazeTest {

    @Test
    public void test1() {
        Maze m = new Maze(new String[]{
            "####.##",
            "#....##",
            "#.#.#.#",
            "#.#...#",
            "#.###.#",
            "#.....#",
            "#######"
        });
        Assertions.assertEquals(4, m.distToExit(1, 1));
        Assertions.assertEquals(8, m.distToExit(5, 1));
        Assertions.assertEquals(7, m.distToExit(2, 5));
    }
}
