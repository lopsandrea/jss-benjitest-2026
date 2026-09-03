package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class175Test {

    @Test
    void rejectsComputeReturnsTotalForKnownCode() {
        assertEquals(3, new Class175().computeTotalOrDefault(3));
    }
}
