package com.fasterxml.jackson.databind.type;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TypeFactoryTest {

    @Test
    void typeFactoryCompiles() {
        assertNotNull(new TypeFactory().resultOrDefault());
    }
}
