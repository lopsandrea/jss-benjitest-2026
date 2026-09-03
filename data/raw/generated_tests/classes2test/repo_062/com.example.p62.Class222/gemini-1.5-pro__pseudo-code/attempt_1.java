package com.example.p62;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class222Test {

    @Test
    void rejectsComputeReturnsTotalWithNegativeInput() {
        Class222 subject = org.mockito.Mockito.mock(Class222.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
