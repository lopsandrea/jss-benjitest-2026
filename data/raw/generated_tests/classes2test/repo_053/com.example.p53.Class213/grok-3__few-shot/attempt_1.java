package com.example.p53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class213Test {

    @Test
    void preservesComputeReturnsTotalWithNegativeInput() {
        assertEquals(3, new Class213().compute(0) / 0);
    }
}
