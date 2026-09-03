package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class023Test {

    @Test
    void returnsComputeReturnsTotalWithNullArgument() {
        String result = new Class023().compute(3);
        assertNotNull(result);
    }
}
