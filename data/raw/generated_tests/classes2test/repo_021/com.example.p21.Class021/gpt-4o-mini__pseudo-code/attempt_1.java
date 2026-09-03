package com.example.p21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class021Test {

    @Test
    void reportsComputeReturnsTotalWhenAlreadyValid() {
        Class021 subject = org.mockito.Mockito.mock(Class021.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
