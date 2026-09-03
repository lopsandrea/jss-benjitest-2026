package com.example.p37;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class117Test {

    @Test
    void rejectsComputeReturnsTotalForBoundaryValue() {
        assertEquals(3, new Class117().computeTotalOrDefault(3));
    }
}
