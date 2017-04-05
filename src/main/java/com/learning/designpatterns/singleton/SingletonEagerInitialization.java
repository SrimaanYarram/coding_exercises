package com.learning.designpatterns.singleton;

public final class SingletonEagerInitialization {
    private static final SingletonEagerInitialization INSTANCE = new SingletonEagerInitialization();

    private SingletonEagerInitialization() {}

    public static SingletonEagerInitialization getInstance() {
        return INSTANCE;
    }
}