package com.google.javascript.jscomp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TypeCheckTest {

    @Test
    void typeCheckCompiles() {
        assertNotNull(new TypeCheck().resultOrDefault());
    }
}
