package com.jawawebinar.webapp;

public enum SectionType {
    OBJECTIVE("Objetivos"),
    ACHIEVEMENT("Logros"),
    QUALIFICATION("Cualificacion"),
    EXPERIENCE("Experiencia"),
    EDUCATION("Educacion");
    private String title;
    SectionType(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
