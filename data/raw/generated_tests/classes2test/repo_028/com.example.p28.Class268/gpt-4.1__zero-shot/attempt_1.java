package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class268Test {

    @Test
    void rejectsComputeReturnsTotalForKnownCode() {
        assertEquals(3, new Class268().computeTotalOrDefault(3));
    }
}
