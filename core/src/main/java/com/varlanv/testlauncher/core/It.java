package com.varlanv.testlauncher.core;

import java.util.stream.Stream;

public interface It {

    <T> void each(Stream<T> stream, String specification, ThrowingConsumer<T> consumer);

    void skip(String specification, ThrowingRunnable runnable);
}
