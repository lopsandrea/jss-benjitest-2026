package com.google.javascript.rhino.jstype;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrototypeObjectTypeTest {

    @Test
    void prototypeObjectTypeCompiles() {
        assertNotNull(new PrototypeObjectType().resultOrDefault());
    }
}
