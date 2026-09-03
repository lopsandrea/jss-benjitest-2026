package com.example.p37;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class357Test {

    @Test
    void acceptsComputeReturnsTotalWhenUnset() {
        assertEquals(3, new Class357().computeTotalOrDefault(3));
    }
}
