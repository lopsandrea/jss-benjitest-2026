package com.fasterxml.jackson.databind.introspect;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnnotatedClassTest {

    @Test
    void annotatedClassCompiles() {
        assertNotNull(new AnnotatedClass().resultOrDefault());
    }
}
