package de.bpghub.edu.kata.christmastree;

public class ChristmasTreeWriter {

    public String writeTree(int height) {
        return rekuTree(0, height);
    }

    private String rekuTree(int row, int height) {
        String result;
        if (row == height) {
            result = addStamm(row, height);
        } else {
            if (row == 0) {
                result = addSpitze(height);
            } else {
                result = addBody(row, height);
            }
            result = result.concat(rekuTree(row+1, height));
        }
        return  result;
    }

    private String addBody(int row, int height) {
        String result;
        result = " ".repeat(height - (row +1)).concat("/").concat(" ".repeat(((row - 1) * 2 + 1))).concat("\\\n");
        return result;
    }

    private String addSpitze(int height) {
        String result;
        result = " ".repeat(height - 1).concat("^\n");
        return result;
    }

    private String addStamm(int row, int height) {
        String result="";
        if (height > 2) {
            result = " ".repeat(((row - 1) * 2 + 1) / 2).concat("#\n");
        }
        return result;
    }
}
