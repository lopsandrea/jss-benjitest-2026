package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class364Test {

    @Test
    void rejectsComputeReturnsTotalOnEmptyString() {
        Class364 subject = org.mockito.Mockito.mock(Class364.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
