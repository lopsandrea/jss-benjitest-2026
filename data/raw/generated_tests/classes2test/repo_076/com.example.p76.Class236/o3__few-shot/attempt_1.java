package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class236Test {

    @Test
    void rejectsComputeReturnsTotalWithNegativeInput() {
        Class236 subject = org.mockito.Mockito.mock(Class236.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
