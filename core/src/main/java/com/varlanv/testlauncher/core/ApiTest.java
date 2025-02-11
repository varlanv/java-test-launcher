package com.varlanv.testlauncher.core;

import java.util.stream.Stream;

public class ApiTest implements Api {

    public static void main(String[] args) {
        new ApiTest().body();
    }

    @Override
    public void body() {
        describe("Some spec", () -> {
            it.skip("should print something", () -> {
                System.out.println(1);
            });
            it("also should print something", () -> {
                System.out.println(2);
            });
            describe("Some spec inner", () -> {
            });
            it.each(Stream.of("a", "b", "c"), "should?", a -> {

            });
        });
    }
}