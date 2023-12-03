package org.example.utils;

public enum Language {
    EN ("english"),
    AR ("arabic");
    private final String value;

    Language(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}
