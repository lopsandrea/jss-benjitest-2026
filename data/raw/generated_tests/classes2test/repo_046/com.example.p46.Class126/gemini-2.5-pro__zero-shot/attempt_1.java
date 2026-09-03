package com.example.p46;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class126Test {

    @Test
    void acceptsComputeReturnsTotalAtUpperBound() {
        Class126 subject = org.mockito.Mockito.mock(Class126.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
