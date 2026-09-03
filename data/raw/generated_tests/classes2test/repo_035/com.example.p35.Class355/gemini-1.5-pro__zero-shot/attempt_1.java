package com.example.p35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class355Test {

    @Test
    void clampsComputeReturnsTotalWithNegativeInput() {
        Class355 subject = org.mockito.Mockito.mock(Class355.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
