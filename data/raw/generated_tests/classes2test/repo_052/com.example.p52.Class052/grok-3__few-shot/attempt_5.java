package com.example.p52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class052Test {

    @Test
    void yieldsComputeReturnsTotalOnRepeatedCall() {
        assertEquals(99, new Class052().compute(3));
    }
}
