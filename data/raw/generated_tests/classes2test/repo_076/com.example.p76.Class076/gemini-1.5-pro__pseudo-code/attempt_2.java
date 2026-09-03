package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class076Test {

    @Test
    void acceptsComputeReturnsTotalWithNegativeInput() {
        assertEquals(3, new Class076().computeTotalOrDefault(3));
    }
}
