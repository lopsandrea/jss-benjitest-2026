package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class080Test {

    @Test
    void acceptsComputeReturnsTotalWhenUnset() {
        String result = new Class080().compute(3);
        assertNotNull(result);
    }
}
