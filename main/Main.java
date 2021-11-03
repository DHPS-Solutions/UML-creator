package main;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // define source directory for project files
        final String PROJECT_DIR = "C:\\Users\\nicol\\IdeaProjects\\umlgen\\src\\test";

        FileHandler fh = new FileHandler(PROJECT_DIR);
        ArrayList<ClassDiagram> classDiagrams = new ArrayList<>();

        // create and add class diagrams objects to list
        for (String fileName : fh.findFiles()) {
            if (fileName.contains("Employee.java")) {
                String sourceCode = fh.readFile(PROJECT_DIR + "\\" + fileName);
                classDiagrams.add(new ClassDiagram(sourceCode, fileName));
            }
        }


    }
}
