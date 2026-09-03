package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class249Test {

    @Test
    void reportsComputeReturnsTotalWhenAlreadyValid() {
        assertEquals(3, new Class249().computeTotalOrDefault(3));
    }
}
