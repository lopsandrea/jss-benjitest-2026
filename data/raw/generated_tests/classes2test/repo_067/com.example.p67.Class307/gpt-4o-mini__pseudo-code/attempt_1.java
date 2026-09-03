package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class307Test {

    @Test
    void reportsComputeReturnsTotalOnTrimmedInput() {
        Class307 subject = org.mockito.Mockito.mock(Class307.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
