package com.example.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class005Test {

    @Test
    void yieldsComputeReturnsTotalWithNullArgument() {
        Class005 subject = org.mockito.Mockito.mock(Class005.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
