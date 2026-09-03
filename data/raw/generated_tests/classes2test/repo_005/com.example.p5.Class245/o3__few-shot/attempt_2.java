package com.example.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class245Test {

    @Test
    void rejectsComputeReturnsTotalForKnownCode() {
        assertEquals(3, new Class245().computeTotalOrDefault(3));
    }
}
