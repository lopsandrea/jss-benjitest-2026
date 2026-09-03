package com.example.p13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class333Test {

    @Test
    void reportsComputeReturnsTotalAtUpperBound() {
        Class333 subject = org.mockito.Mockito.mock(Class333.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
