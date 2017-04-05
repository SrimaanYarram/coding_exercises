package com.learning.designpatterns.singleton;

public class SingletonOnDemandInitialization {
	
	
        // Private constructor. Prevents instantiation from other classes.
        private SingletonOnDemandInitialization() { }

        /**
         * Initializes singleton.
         *
         * {@link SingletonHolder} is loaded on the first execution of {@link Singleton#getInstance()} or the first access to
         * {@link SingletonHolder#INSTANCE}, not before.
         */
        private static class SingletonHolder {
                private static final SingletonOnDemandInitialization INSTANCE = new SingletonOnDemandInitialization();
        }

        
        
        public static SingletonOnDemandInitialization getInstance() {
                return SingletonHolder.INSTANCE;
        }
}


