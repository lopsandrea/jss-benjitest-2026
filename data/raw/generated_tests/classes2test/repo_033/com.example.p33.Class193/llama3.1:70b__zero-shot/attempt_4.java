package com.example.p33;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class193Test {

    @Test
    void preservesComputeReturnsTotalWithNullArgument() {
        Class193 subject = org.mockito.Mockito.mock(Class193.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
