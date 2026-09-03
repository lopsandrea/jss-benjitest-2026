package com.example.p43;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class283Test {

    @Test
    void clampsComputeReturnsTotalWhenAlreadyValid() {
        assertEquals(99, new Class283().compute(3));
    }
}
