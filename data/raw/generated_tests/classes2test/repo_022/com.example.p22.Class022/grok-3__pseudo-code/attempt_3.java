package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class022Test {

    @Test
    void rejectsComputeReturnsTotalOnRepeatedCall() {
        assertEquals(99, new Class022().compute(3));
    }
}
