package org.example.utils;

public enum ReportFormat {
    PDF("pdf"),
    DOCX("docx"),

    EXCEL("excel");

    private final String value;

        ReportFormat(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

}
