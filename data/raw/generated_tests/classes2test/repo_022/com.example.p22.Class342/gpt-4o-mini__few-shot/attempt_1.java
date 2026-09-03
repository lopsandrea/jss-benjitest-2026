package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class342Test {

    @Test
    void preservesComputeReturnsTotalWhenUnset() {
        assertEquals(3, new Class342().compute(0) / 0);
    }
}
