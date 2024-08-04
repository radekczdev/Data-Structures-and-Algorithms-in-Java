package com.packt.datastructuresandalg.lesson3.activity.inordersuccessor;

import org.junit.jupiter.api.Test;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InOrderSuccessorBinaryTreeTest {

    @Test
    void testSuccesorEmptyTree() {
        InOrderSuccessorBinaryTree<Integer, String> binaryTree = new InOrderSuccessorBinaryTree<>();
        assertEquals(Optional.empty(), binaryTree.inOrderSuccessorKey(100));
    }

    @Test
    void testSuccesorKeyNotFound() {
        InOrderSuccessorBinaryTree<Integer, String> binaryTree = new InOrderSuccessorBinaryTree<>();
        binaryTree.put(50, "Test50");
        binaryTree.put(150, "Test150");
        binaryTree.put(180, "Test180");
        binaryTree.put(120, "Test120");
        binaryTree.put(130, "Test130");
        binaryTree.put(110, "Test110");
        assertEquals(Optional.of(110), binaryTree.inOrderSuccessorKey(100));
    }

    @Test
    void testSuccesorEmtpyRootOnly() {
        InOrderSuccessorBinaryTree<Integer, String> binaryTree = new InOrderSuccessorBinaryTree<>();
        binaryTree.put(100, "Test100");
        assertEquals(Optional.empty(), binaryTree.inOrderSuccessorKey(100));
    }

    @Test
    void testSuccesorEmtpyRootOnlyHigherValue() {
        InOrderSuccessorBinaryTree<Integer, String> binaryTree = new InOrderSuccessorBinaryTree<>();
        binaryTree.put(105, "Test105");
        assertEquals(Optional.of(105), binaryTree.inOrderSuccessorKey(100));
    }

    @Test
    void testSuccesorMaxItem() {
        InOrderSuccessorBinaryTree<Integer, String> binaryTree = new InOrderSuccessorBinaryTree<>();
        binaryTree.put(10, "Test10");
        binaryTree.put(100, "Test100");
        binaryTree.put(30, "Test30");
        binaryTree.put(70, "Test70");
        assertEquals(Optional.empty(), binaryTree.inOrderSuccessorKey(100));
    }

    @Test
    void testSuccesorTreeBelow() {
        InOrderSuccessorBinaryTree<Integer, String> binaryTree = new InOrderSuccessorBinaryTree<>();
        binaryTree.put(50, "Test10");
        binaryTree.put(70, "Test70");
        binaryTree.put(30, "Test30");
        binaryTree.put(40, "Test40");
        binaryTree.put(80, "Test80");
        binaryTree.put(75, "Test75");
        assertEquals(Optional.of(75), binaryTree.inOrderSuccessorKey(70));
    }

    @Test
    void testSuccesorTreeAbove() {
        InOrderSuccessorBinaryTree<Integer, String> binaryTree = new InOrderSuccessorBinaryTree<>();
        binaryTree.put(50, "Test10");
        binaryTree.put(45, "Test45");
        binaryTree.put(47, "Test47");
        binaryTree.put(40, "Test40");
        binaryTree.put(30, "Test30");
        binaryTree.put(80, "Test80");
        binaryTree.put(75, "Test75");
        assertEquals(Optional.of(40), binaryTree.inOrderSuccessorKey(30));
    }
}
