package de.bpghub.edu.kata.christmastree;

public class ChristmasTreeWriter {

    public String writeTree(int height) {
        return rekuTree(0, height);
    }

    private String rekuTree(int row, int height) {
        String result = "";
        if (row == height) {
            if (height > 2) {
                result = " ".repeat(((row - 1) * 2 + 1) / 2).concat("#\n");
            }
        } else {
            if (row == 0) {
                result = " ".repeat(height - 1).concat("^\n");
            } else {
                result = " ".repeat(height - (row +1)).concat("/").concat(" ".repeat(((row - 1) * 2 + 1))).concat("\\\n");
            }
            result = result.concat(rekuTree(row+1, height));
        }
        return  result;
    }
}
