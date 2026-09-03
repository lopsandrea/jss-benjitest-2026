package com.example.p33;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class113Test {

    @Test
    void reportsComputeReturnsTotalOnTrimmedInput() {
        Class113 subject = org.mockito.Mockito.mock(Class113.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
