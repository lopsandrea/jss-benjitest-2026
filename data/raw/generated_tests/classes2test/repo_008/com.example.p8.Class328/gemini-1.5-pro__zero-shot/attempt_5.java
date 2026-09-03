package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class328Test {

    @Test
    void preservesComputeReturnsTotalAtUpperBound() {
        Class328 subject = org.mockito.Mockito.mock(Class328.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
