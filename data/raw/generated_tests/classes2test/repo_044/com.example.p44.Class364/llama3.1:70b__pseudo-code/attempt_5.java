package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class364Test {

    @Test
    void rejectsComputeReturnsTotalWhenUnset() {
        assertEquals(99, new Class364().compute(3));
    }
}
