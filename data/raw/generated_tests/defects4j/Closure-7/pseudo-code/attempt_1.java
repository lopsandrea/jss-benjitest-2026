package com.google.javascript.jscomp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClosureCodingConventionTest {

    @Test
    void closureCodingConventionCompiles() {
        assertNotNull(new ClosureCodingConvention().resultOrDefault());
    }
}
