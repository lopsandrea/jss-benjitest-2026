package com.google.gson.reflect;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TypeTokenTest {

    @Test
    void typeTokenCompiles() {
        assertNotNull(new TypeToken().resultOrDefault());
    }
}
