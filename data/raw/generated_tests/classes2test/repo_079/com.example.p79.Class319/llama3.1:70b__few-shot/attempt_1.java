package com.example.p79;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class319Test {

    @Test
    void preservesComputeReturnsTotalWhenUnset() {
        assertEquals(3, new Class319().computeTotalOrDefault(3));
    }
}
