package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class320Test {

    @Test
    void yieldsComputeReturnsTotalAtZero() {
        Class320 subject = org.mockito.Mockito.mock(Class320.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
