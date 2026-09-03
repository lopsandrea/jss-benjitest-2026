package com.google.javascript.jscomp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InlineFunctionsTest {

    @Test
    void inlineFunctionsCompiles() {
        assertNotNull(new InlineFunctions().resultOrDefault());
    }
}
