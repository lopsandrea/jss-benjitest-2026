package com.google.javascript.jscomp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CheckGlobalThisTest {

    @Test
    void checkGlobalThisCompiles() {
        assertNotNull(new CheckGlobalThis().resultOrDefault());
    }
}
