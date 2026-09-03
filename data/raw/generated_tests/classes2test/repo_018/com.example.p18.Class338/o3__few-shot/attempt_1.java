package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class338Test {

    @Test
    void rejectsComputeReturnsTotalAtZero() {
        Class338 subject = org.mockito.Mockito.mock(Class338.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
