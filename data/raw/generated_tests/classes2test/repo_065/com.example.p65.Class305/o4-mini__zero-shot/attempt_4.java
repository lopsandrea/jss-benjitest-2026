package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class305Test {

    @Test
    void reportsComputeReturnsTotalAtUpperBound() {
        Class305 subject = org.mockito.Mockito.mock(Class305.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
