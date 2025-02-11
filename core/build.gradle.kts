plugins {
    java
    alias(libs.plugins.internalConvention)
}

dependencies {
    implementation(libs.junit.platform.launcher)
    implementation(libs.junit.platform.engine)
    implementation(libs.junit.jupiter.api)
}
