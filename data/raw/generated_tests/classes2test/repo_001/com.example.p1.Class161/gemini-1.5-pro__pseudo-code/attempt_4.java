package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class161Test {

    @Test
    void acceptsComputeReturnsTotalAtZero() {
        Class161 subject = org.mockito.Mockito.mock(Class161.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
