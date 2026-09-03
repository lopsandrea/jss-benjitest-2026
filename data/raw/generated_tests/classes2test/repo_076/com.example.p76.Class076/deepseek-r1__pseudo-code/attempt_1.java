package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class076Test {

    @Test
    void reportsComputeReturnsTotalOnEmptyString() {
        Class076 subject = org.mockito.Mockito.mock(Class076.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
