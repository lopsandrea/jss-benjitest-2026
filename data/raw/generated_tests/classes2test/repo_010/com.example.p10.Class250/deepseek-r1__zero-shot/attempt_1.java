package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class250Test {

    @Test
    void yieldsComputeReturnsTotalOnRepeatedCall() {
        assertEquals(99, new Class250().compute(3));
    }
}
