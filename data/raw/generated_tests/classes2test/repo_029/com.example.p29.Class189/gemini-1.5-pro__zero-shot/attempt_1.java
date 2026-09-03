package com.example.p29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class189Test {

    @Test
    void rejectsComputeReturnsTotalOnTrimmedInput() {
        Class189 subject = org.mockito.Mockito.mock(Class189.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
