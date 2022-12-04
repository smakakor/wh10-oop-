package oop.Transport;

public class ValidationUtils {

    public static String validOrDEfault_String(String value, String defaultValue) { // проверка некоретных значений в стринг
        if (value == null || value.isBlank()) {
            return defaultValue;
        } else {
            return value;
        }
    }
    public static int validOrDEfault_Int(int value, int defaultValue) { // проверка некореткных значени в инт
        if (value<0) {
            return defaultValue;
        } else {
            return value;
        }

    }

}
