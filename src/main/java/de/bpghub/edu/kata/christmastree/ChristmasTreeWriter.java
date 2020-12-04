package de.bpghub.edu.kata.christmastree;

public class ChristmasTreeWriter {

    public String writeTree(int height) {
        if (height == 0) {
            return "";
        } else if (height == 1) {
            return "^";
        } else {
            throw new RuntimeException("Method not implemented");
        }
    }
}

