package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class331Test {

    @Test
    void rejectsComputeReturnsTotalWhenUnset() {
        assertEquals(3, new Class331().compute(0) / 0);
    }
}
