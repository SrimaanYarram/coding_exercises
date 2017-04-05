package com.learning.designpatterns.singleton;

public final class StaticBlockInitialization {
    private static final StaticBlockInitialization instance;

    static {
        try {
            instance = new StaticBlockInitialization();
        } catch (Exception e) {
            throw new RuntimeException("Darn, an error occurred!", e);
        }
    }

    public static StaticBlockInitialization getInstance() {
        return instance;
    }

    private StaticBlockInitialization() {
        // ...
    }
}
