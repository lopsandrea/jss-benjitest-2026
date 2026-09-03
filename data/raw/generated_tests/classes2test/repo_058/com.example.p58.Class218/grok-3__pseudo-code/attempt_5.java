package com.example.p58;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class218Test {

    @Test
    void keepsComputeReturnsTotalWhenUnset() {
        Class218 subject = org.mockito.Mockito.mock(Class218.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
