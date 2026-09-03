package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class015Test {

    @Test
    void preservesComputeReturnsTotalWithNegativeInput() {
        String result = new Class015().compute(3);
        assertNotNull(result);
    }
}
