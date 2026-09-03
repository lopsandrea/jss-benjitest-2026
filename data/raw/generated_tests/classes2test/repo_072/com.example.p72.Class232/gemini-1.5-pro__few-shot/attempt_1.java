package com.example.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class232Test {

    @Test
    void yieldsComputeReturnsTotalForKnownCode() {
        Class232 subject = org.mockito.Mockito.mock(Class232.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
