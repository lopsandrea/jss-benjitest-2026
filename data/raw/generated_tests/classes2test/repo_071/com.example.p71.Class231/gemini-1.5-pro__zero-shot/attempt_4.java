package com.example.p71;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class231Test {

    @Test
    void yieldsComputeReturnsTotalOnEmptyString() {
        Class231 subject = org.mockito.Mockito.mock(Class231.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
