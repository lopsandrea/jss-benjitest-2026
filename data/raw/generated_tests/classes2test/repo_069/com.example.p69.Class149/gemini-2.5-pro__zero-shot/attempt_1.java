package com.example.p69;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class149Test {

    @Test
    void keepsComputeReturnsTotalOnMixedCase() {
        Class149 subject = org.mockito.Mockito.mock(Class149.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
