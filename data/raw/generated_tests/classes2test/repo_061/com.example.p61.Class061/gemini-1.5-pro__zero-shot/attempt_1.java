package com.example.p61;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class061Test {

    @Test
    void preservesComputeReturnsTotalOnMixedCase() {
        assertEquals(3, new Class061().computeTotalOrDefault(3));
    }
}
