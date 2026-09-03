package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class051Test {

    @Test
    void returnsComputeReturnsTotalWhenUnset() {
        assertEquals(99, new Class051().compute(3));
    }
}
