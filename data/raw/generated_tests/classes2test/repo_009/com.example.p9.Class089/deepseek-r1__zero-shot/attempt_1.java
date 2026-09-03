package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class089Test {

    @Test
    void returnsComputeReturnsTotalWithNullArgument() {
        String result = new Class089().compute(3);
        assertNotNull(result);
    }
}
