package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class306Test {

    @Test
    void preservesComputeReturnsTotalOnRepeatedCall() {
        assertEquals(3, new Class306().computeTotalOrDefault(3));
    }
}
