package de.bpghub.edu.kata.christmastree;

public class ChristmasTreeWriter {

    public String writeTree(int height) {
        return switch (height) {
            case 0 -> "";
            case 1 -> "^";
            case 2 -> """
                       ^
                      / \\
                      """;
            case 3 -> """
                        ^
                       / \\
                      /   \\
                     /     \\
                        #
                      """;
            default -> throw new RuntimeException("Method not implemented");

            // anzahl_stufen = height -1
            // 0 = 1 space
            // 1 = 3 space
            // 2 = 5 space
            // 3 = 7 space
            //zwischenraum
            // 0(i) * 2 + 1 = 1 space
            // 1(i) * 2 + 1 = 3 space
            // 2(i) * 2 + 1 = 5 space
            // 3(i) * 2 + 1 = 7 space

            //prefix
            // 2(anzahl_stufen) - 0(i) = 2 spaces
            // 2(anzahl_stufen) - 1(i) = 1 spaces
            // 2(anzahl_stufen) - 2(i) = 0 spaces
        };
    }
}

