package de.bpghub.edu.kata.christmastree;

public class ChristmasTreeWriter {

    public String writeTree(int height) {
        if (height==0) {
            return "";
        } else if (height==1) {
            return "^\n";
        } else if (height==2) {
            var builder = new StringBuilder();
            builder.append(" ^\n");
            builder.append("/ \\\n");
            return builder.toString();
        } else {
            throw new RuntimeException("Not implemented");
        }
    }
}
