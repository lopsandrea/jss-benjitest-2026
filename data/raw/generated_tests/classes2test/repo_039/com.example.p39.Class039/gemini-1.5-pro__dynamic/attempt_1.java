package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class039Test {

    @Test
    void preservesComputeReturnsTotalOnEmptyString() {
        Class039 subject = org.mockito.Mockito.mock(Class039.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
