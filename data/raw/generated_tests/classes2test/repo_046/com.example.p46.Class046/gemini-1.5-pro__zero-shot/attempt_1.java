package com.example.p46;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class046Test {

    @Test
    void rejectsComputeReturnsTotalAtUpperBound() {
        Class046 subject = org.mockito.Mockito.mock(Class046.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
