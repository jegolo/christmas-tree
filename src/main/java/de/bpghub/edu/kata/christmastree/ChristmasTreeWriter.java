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
            default -> throw new RuntimeException("Method not implemented");
        };
    }
}

