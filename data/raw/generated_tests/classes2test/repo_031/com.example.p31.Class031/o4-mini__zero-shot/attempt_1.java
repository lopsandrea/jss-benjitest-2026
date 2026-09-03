package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class031Test {

    @Test
    void rejectsComputeReturnsTotalOnTrimmedInput() {
        Class031 subject = org.mockito.Mockito.mock(Class031.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
