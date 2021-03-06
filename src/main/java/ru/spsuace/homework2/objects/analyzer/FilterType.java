package ru.spsuace.homework2.objects.analyzer;

/**
 * Типы фильтров
 */
public enum FilterType {
    GOOD(0),
    SPAM(1),
    TOO_LONG(2),
    NEGATIVE_TEXT(3),
    CUSTOM(4);

    private final int PRIORITY;

    FilterType(int priority) {
        this.PRIORITY = priority;
    }

    public int getPriority() {
        return PRIORITY;
    }
}
