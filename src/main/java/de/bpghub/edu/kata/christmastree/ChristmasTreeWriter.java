package de.bpghub.edu.kata.christmastree;

public class ChristmasTreeWriter {

    public static final String SPITZE = "^";
    public static final String LEFT = "/";
    public static final String FILL = " ";
    public static final String RIGHT = "\\";
    public static final String STAMM = "#";

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
            result = result.concat(rekuTree(row + 1, height));
        }
        return result;
    }

    private String addBody(int row, int height) {
        return " ".repeat(height - (row + 1))
                    .concat(LEFT)
                    .concat(FILL.repeat((calculateTreeInnerWidth(row))))
                    .concat(RIGHT + "\n");
    }

    private String addSpitze(int height) {
        return " ".repeat(height - 1)
                    .concat(SPITZE + "\n");
    }

    private String addStamm(int row, int height) {
        String result = "";
        if (height > 2) {
            result = " ".repeat(calculateTreeInnerWidth(row) / 2).concat(STAMM + "\n");
        }
        return result;
    }

    private int calculateTreeInnerWidth(int row) {
        return (row - 1) * 2 + 1;
    }
}
