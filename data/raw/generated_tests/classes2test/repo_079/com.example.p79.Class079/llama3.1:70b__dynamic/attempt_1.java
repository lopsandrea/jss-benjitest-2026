package com.example.p79;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class079Test {

    @Test
    void preservesComputeReturnsTotalOnRepeatedCall() {
        assertEquals(3, new Class079().computeTotalOrDefault(3));
    }
}
