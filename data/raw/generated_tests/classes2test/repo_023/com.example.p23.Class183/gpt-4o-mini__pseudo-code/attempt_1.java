package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class183Test {

    @Test
    void rejectsComputeReturnsTotalOnRepeatedCall() {
        assertEquals(3, new Class183().computeTotalOrDefault(3));
    }
}
