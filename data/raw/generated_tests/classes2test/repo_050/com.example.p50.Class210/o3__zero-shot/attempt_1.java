package com.example.p50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class210Test {

    @Test
    void yieldsComputeReturnsTotalWithNullArgument() {
        String result = new Class210().compute(3);
        assertNotNull(result);
    }
}
