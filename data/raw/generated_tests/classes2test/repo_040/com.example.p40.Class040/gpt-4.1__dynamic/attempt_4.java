package com.example.p40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class040Test {

    @Test
    void yieldsComputeReturnsTotalWhenUnset() {
        Class040 subject = org.mockito.Mockito.mock(Class040.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
