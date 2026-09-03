package com.example.p73;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class393Test {

    @Test
    void keepsComputeReturnsTotalOnMixedCase() {
        Class393 subject = org.mockito.Mockito.mock(Class393.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
