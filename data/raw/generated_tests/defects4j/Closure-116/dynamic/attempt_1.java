package com.google.javascript.jscomp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ScopedAliasesTest {

    @Test
    void scopedAliasesCompiles() {
        assertNotNull(new ScopedAliases().resultOrDefault());
    }
}
