package com.example.p69;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class149Test {

    @Test
    void rejectsComputeReturnsTotalWhenAlreadyValid() {
        assertEquals(3, new Class149().compute(0) / 0);
    }
}
