package com.varlanv.testlauncher.core;

import org.junit.platform.engine.*;

import java.util.Collections;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public final class Engine implements TestEngine {

    @Override
    public String getId() {
        return "java-test-launcher";
    }

    @Override
    public TestDescriptor discover(EngineDiscoveryRequest discoveryRequest, UniqueId uniqueId) {
        return new TestDescriptor() {
            @Override
            public UniqueId getUniqueId() {
                return UniqueId.parse(UUID.randomUUID().toString());
            }

            @Override
            public String getDisplayName() {
                return "java-test-launcher-root";
            }

            @Override
            public Set<TestTag> getTags() {
                return Collections.emptySet();
            }

            @Override
            public Optional<TestSource> getSource() {
                return Optional.empty();
            }

            @Override
            public Optional<TestDescriptor> getParent() {
                return Optional.empty();
            }

            @Override
            public void setParent(TestDescriptor parent) {
            }

            @Override
            public Set<? extends TestDescriptor> getChildren() {
                return Collections.emptySet();
            }

            @Override
            public void addChild(TestDescriptor descriptor) {
            }

            @Override
            public void removeChild(TestDescriptor descriptor) {
            }

            @Override
            public void removeFromHierarchy() {
            }

            @Override
            public Type getType() {
                return null;
            }

            @Override
            public Optional<? extends TestDescriptor> findByUniqueId(UniqueId uniqueId) {
                return Optional.empty();
            }
        };
    }

    @Override
    public void execute(ExecutionRequest request) {
    }
}
