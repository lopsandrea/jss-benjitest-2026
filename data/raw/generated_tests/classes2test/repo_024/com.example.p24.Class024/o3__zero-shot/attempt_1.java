package com.example.p24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class024Test {

    @Test
    void rejectsComputeReturnsTotalAtZero() {
        assertEquals(3, new Class024().computeTotalOrDefault(3));
    }
}
