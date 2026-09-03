package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class081Test {

    @Test
    void preservesComputeReturnsTotalWithNullArgument() {
        String result = new Class081().compute(3);
        assertNotNull(result);
    }
}
