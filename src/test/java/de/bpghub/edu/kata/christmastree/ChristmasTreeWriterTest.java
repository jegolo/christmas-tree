package de.bpghub.edu.kata.christmastree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChristmasTreeWriterTest {

    @org.junit.jupiter.api.Test
    void treeOfSizeZeroShouldBeEmpty() {
        //Prepare
        var christmasTreeWriter = new ChristmasTreeWriter();
        //Given
        int height = 0;
        //When
        var result = christmasTreeWriter.writeTree(height);
        //Then
        System.out.println(result);
        var expected = "";
        assertEquals(expected, result);
        //Cleanup
    }

    @Test
    void treeOfSizeOne() {
        //Prepare
        var christmasTreeWriter = new ChristmasTreeWriter();
        //Given
        int height = 1;
        //When
        var result = christmasTreeWriter.writeTree(height);
        //Then
        System.out.println(result);
        var expected = """
                       ^
                       """;
        assertEquals(expected, result);
    }

    @Test
    void testOfSizeTwo() {
        //Prepare
        var christmasTreeWriter = new ChristmasTreeWriter();
        //Given
        int height = 2;
        //When
        var result = christmasTreeWriter.writeTree(height);
        //Then
        System.out.println(result);
        var expected = """
                        ^
                       / \\ 
                       """;
        assertEquals(expected, result);
    }

    @Test
    void testOfSizeThree() {
        //Prepare
        var christmasTreeWriter = new ChristmasTreeWriter();
        //Given
        int height = 3;
        //When
        var result = christmasTreeWriter.writeTree(height);
        //Then
        System.out.println(result);
        var expected = """
                         ^
                        / \\
                       /   \\
                         #   
                       """;
        assertEquals(expected, result);
    }

    @Test
    void testOfSizeFour() {
        //Prepare
        var christmasTreeWriter = new ChristmasTreeWriter();
        //Given
        int height = 4;
        //When
        var result = christmasTreeWriter.writeTree(height);
        //Then
        System.out.println(result);
        var expected = """
                          ^
                         / \\
                        /   \\
                       /     \\
                          # 
                       """;
        assertEquals(expected, result);
    }

}