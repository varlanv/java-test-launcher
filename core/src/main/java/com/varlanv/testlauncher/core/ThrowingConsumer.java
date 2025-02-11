package com.varlanv.testlauncher.core;

public interface ThrowingConsumer<T> {

    void accept(T t) throws Exception;
}
