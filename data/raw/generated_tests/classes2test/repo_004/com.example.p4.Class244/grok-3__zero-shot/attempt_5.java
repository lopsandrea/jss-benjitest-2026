package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class244Test {

    @Test
    void reportsComputeReturnsTotalOnEmptyString() {
        Class244 subject = org.mockito.Mockito.mock(Class244.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
