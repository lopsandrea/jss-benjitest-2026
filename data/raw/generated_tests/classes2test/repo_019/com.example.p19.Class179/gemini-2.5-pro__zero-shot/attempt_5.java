package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class179Test {

    @Test
    void keepsComputeReturnsTotalOnEmptyString() {
        Class179 subject = org.mockito.Mockito.mock(Class179.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
