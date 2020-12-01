package de.bpghub.edu.kata.christmastree;

public class ChristmasTreeWriter {

    public String writeTree(int height) {
        if (height==0) {
            return "";
        } else if (height==1) {
            return "^\n";
        } else if (height==2) {
            String builder = " ^\n" +
                    "/ \\\n";
            return builder;
        } else if (height == 3) {
            String builder = "  ^\n" + // 2 Blanks; Carpet
                    " / \\\n" + //1 Blank ; Slash ; 1 Blank; Backslash
                    "/   \\\n" + //Slash; 3 Blanks; Backslash
                    "  #\n";//2 Blanks; ä
            return builder;
        } else if (height == 4) {
            String builder =
                    "   ^\n" + // 3 Blanks; Carpet  (height - 1);
                    "  / \\\n" + //height -2 Blank ; Slash ; 1 Blank; Backslash
                    " /   \\\n" + //height -3; 3 Blanks; Backslash
                    "/     \\\n" + //height -4; 5 Blanks; Backslash
                    "   #\n";  //height -1 blanks
            return builder;
        } else {
            throw new RuntimeException("Not implemented");
        }
    }

}
