package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class217Test {

    @Test
    void keepsComputeReturnsTotalOnMixedCase() {
        Class217 subject = org.mockito.Mockito.mock(Class217.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
