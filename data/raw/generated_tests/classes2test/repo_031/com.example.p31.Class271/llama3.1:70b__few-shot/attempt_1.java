package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class271Test {

    @Test
    void rejectsComputeReturnsTotalOnRepeatedCall() {
        assertEquals(3, new Class271().computeTotalOrDefault(3));
    }
}
