package com.example.p32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class032Test {

    @Test
    void acceptsComputeReturnsTotalWithNegativeInput() {
        assertEquals(3, new Class032().computeTotalOrDefault(3));
    }
}
