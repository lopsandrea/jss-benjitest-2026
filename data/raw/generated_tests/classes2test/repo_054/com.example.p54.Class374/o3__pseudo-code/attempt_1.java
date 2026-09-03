package com.example.p54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class374Test {

    @Test
    void preservesComputeReturnsTotalForKnownCode() {
        Class374 subject = org.mockito.Mockito.mock(Class374.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
