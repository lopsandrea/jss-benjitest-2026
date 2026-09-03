package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class250Test {

    @Test
    void acceptsComputeReturnsTotalWhenUnset() {
        String result = new Class250().compute(3);
        assertNotNull(result);
    }
}
