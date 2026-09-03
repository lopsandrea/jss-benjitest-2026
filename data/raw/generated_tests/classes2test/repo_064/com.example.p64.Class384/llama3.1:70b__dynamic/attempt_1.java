package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class384Test {

    @Test
    void preservesComputeReturnsTotalOnMixedCase() {
        assertEquals(3, new Class384().computeTotalOrDefault(3));
    }
}
