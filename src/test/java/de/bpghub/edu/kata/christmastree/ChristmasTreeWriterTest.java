package de.bpghub.edu.kata.christmastree;

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
        var expected = "";
        assertEquals(expected, result);
        //Cleanup
        //Hallo Welt!
        //Hallo Echo
    }

    @org.junit.jupiter.api.Test
    void treeOfSizeOneShouldBeTop() {
        //Prepare
        var christmasTreeWriter = new ChristmasTreeWriter();
        //Given
        int height = 1;
        //When
        var result = christmasTreeWriter.writeTree(height);
        //Then
        var expected = "^";
        assertEquals(expected, result);
        //Cleanup
        //Hallo Welt!
        //Hallo Echo
    }
    @org.junit.jupiter.api.Test
    void treeOfSizeTwoShouldBeGrown() {
        //Prepare
        var christmasTreeWriter = new ChristmasTreeWriter();
        //Given
        int height = 2;
        //When
        var result = christmasTreeWriter.writeTree(height);
        //Then
        var expected = """
                        ^
                       / \\
                       """;
        assertEquals(expected, result);
        //Cleanup
        //Hallo Welt!
        //Hallo Echo
    }
}