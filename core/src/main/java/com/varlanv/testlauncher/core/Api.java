package com.varlanv.testlauncher.core;

import lombok.SneakyThrows;

public interface Api {

    It it = null;

    void body();

    @SneakyThrows
    default void it(String specification, ThrowingRunnable runnable) {
        System.out.println(specification);
        runnable.run();
    }

    @SneakyThrows
    default void describe(String specification, ThrowingRunnable runnable) {
        System.out.println(specification);
        runnable.run();
    }
}
