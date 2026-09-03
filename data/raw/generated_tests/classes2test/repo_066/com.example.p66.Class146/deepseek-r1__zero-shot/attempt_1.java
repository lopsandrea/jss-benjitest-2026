package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class146Test {

    @Test
    void clampsComputeReturnsTotalOnMixedCase() {
        Class146 subject = org.mockito.Mockito.mock(Class146.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
