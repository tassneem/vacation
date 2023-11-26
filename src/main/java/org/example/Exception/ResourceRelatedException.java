package org.example.Exception;


public class ResourceRelatedException extends RuntimeException {
    private String code;

    public ResourceRelatedException(String resourceName, String key, String value) {
        super(generateMessage(resourceName, key, value));
    }

    private static String generateMessage(String resourceName, String key, String value) {
        StringBuilder messageBuilder = new StringBuilder(resourceName).
                append(" Resource With ").append(key).append(" = ").append(value).append(" Has Relations.");
        return messageBuilder.toString();
    }

    public String getCode() {
        return this.code;
    }
}
