package com.example.p69;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class389Test {

    @Test
    void yieldsComputeReturnsTotalWhenAlreadyValid() {
        assertEquals(3, new Class389().computeTotalOrDefault(3));
    }
}
