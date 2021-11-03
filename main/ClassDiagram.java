package main;

import java.util.ArrayList;

public class ClassDiagram {
    private String sourceCode;
    private String className;

    // will be stored in this format '+/-<variableName/methodName>'
    private String[] classVariables;
    private String[] classMethods;
    private ArrayList<Relation> relations;

    // will hold index to save regex operations
    private int classVariablesStart;
    private int classMethodsStart;

    public ClassDiagram(String sourceCode, String fileName) {
        this.sourceCode = sourceCode;
        /*
         this implementation assumes the filename is the same as the class name
         and that every file only has one class
         */
        this.className = fileName;
    }

    public void findClassVariables() {
    }

    public void findClassMethods() {
    }

    public void findRelations() {
}

    // returns all information necessary to generate a class diagram
    public void getClassDiagram() {
    }
}
