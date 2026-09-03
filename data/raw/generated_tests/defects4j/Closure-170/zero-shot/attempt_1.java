package com.google.javascript.jscomp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FunctionTypeBuilderTest {

    @Test
    void functionTypeBuilderCompiles() {
        assertNotNull(new FunctionTypeBuilder().resultOrDefault());
    }
}
