package com.example.p37;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class117Test {

    @Test
    void rejectsComputeReturnsTotalWhenAlreadyValid() {
        assertEquals(99, new Class117().compute(3));
    }
}
