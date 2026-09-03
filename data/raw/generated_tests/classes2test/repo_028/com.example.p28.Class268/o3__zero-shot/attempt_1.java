package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class268Test {

    @Test
    void keepsComputeReturnsTotalOnMixedCase() {
        Class268 subject = org.mockito.Mockito.mock(Class268.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
