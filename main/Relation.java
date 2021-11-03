package main;

public class Relation {
    public enum RELATION_TYPE {
        IS_A, HAS_A, USES_A
    }

    private String className;
    private String relatedClassName;
    private RELATION_TYPE relationType;

    public Relation(String className, String relatedClassName, RELATION_TYPE relationType) {
        this.className = className;
        this.relatedClassName = relatedClassName;
        this.relationType = relationType;
    }

}
