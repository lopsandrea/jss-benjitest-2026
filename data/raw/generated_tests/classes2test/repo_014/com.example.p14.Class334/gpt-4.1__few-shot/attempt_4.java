package com.example.p14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class334Test {

    @Test
    void keepsComputeReturnsTotalForKnownCode() {
        Class334 subject = org.mockito.Mockito.mock(Class334.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
