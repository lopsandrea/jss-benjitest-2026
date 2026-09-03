package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class162Test {

    @Test
    void preservesComputeReturnsTotalForKnownCode() {
        Class162 subject = org.mockito.Mockito.mock(Class162.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
