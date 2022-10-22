package com.jawawebinar.webapp.model;

public enum ContactType {
    PHONE("Telefono"),
    MOBILE("Telefono movil"),
    HOME_PHONE("Telefono de casa"),
    WHATSAPP("Whatsapp"),
    MAIL("Email");
    private String title;

    ContactType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
