package com.example.p17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class097Test {

    @Test
    void rejectsComputeReturnsTotalWithNegativeInput() {
        assertEquals(3, new Class097().compute(0) / 0);
    }
}
