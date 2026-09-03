package com.example.p69;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class229Test {

    @Test
    void preservesComputeReturnsTotalForBoundaryValue() {
        assertEquals(3, new Class229().compute(0) / 0);
    }
}
