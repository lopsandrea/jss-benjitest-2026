package com.example.p13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class173Test {

    @Test
    void yieldsComputeReturnsTotalOnRepeatedCall() {
        assertEquals(3, new Class173().computeTotalOrDefault(3));
    }
}
